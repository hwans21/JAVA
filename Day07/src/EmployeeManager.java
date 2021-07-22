import java.util.Scanner;

public class EmployeeManager {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 사원의 정보 : 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		// 실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수
		int count = 0;

		while (true) {
			System.out.println("\n========= 사원 관리 프로그램 =========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");
			System.out.println("\n=================================");
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				// 사번은 중복되지 않습니다. (무한루프를 구현해서 중복이 발생하면 다시 입력받기)
				System.out.println("# 사원정보 등록을 시작합니다.");
				System.out.print(" - 사번 : ");
				String empNum = sc.next();
				while (true) {
					boolean flag = false;
					for (int i = 0; i < count; i++) {
						if (empNum.equals(userNums[i])) { // 사용자가 입력한 사번이 이미 존재하는 경우
							System.out.print("이미 중복된 사번입니다.");
							flag = true;
							break;

						}
					}
					if (!flag) {
						userNums[count] = empNum;
						break; // 사번 확인용 무한루프 탈출
					} else {
						System.out.println(" - 사번 :");
						empNum = sc.next();
					}

				}
				System.out.print(" - 이름 : ");
				names[count] = sc.next();
				System.out.print(" - 나이 : ");
				ages[count] = sc.nextInt();
				System.out.print(" - 부서 : ");
				departments[count] = sc.next();
				count++;

			} else if (menu == 2) {
				// 각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성
				// 만약 사용자가 사원등록을 한 명도 하지 않았다면
				// "등록된 사원정보가 없습니다."를 출력하시면 됩니다.
				if (count == 0) {
					System.out.println("등록된 사원정보가 없습니다.");

				} else {
					System.out.println("============== 전체 사원 정보 =============");
					System.out.printf("%s%16s%10s%10s\n", "사번", "이름", "나이", "부서");
					System.out.println("=====================================");
					for (int i = 0; i < count; i++) {
						System.out.printf("%s%10s%10d세%10s\n", userNums[i], names[i], ages[i], departments[i]);
					}
					System.out.println("=====================================");
				}

			} else if (menu == 3) {
				// 입력한 사번에 일치하는 사원의 4가지 정보를 위 2번과 같은 형태로 출력하세요
				// 입력한 사번이 존재하지 않는다면 "조회하신 사번의 정보가 없습니다."
				// 를 출력하세요.
				System.out.println("# 조회하실 사원의 번호를 입력하세요. ");
				System.out.print("> ");
				String empNum = sc.next();
				int i;
				for (i = 0; i < count; i++) {
					if (userNums[i].equals(empNum)) {
						System.out.println("============== 사원 정보 =============");
						System.out.printf("%s%16s%10s%10s\n", "사번", "이름", "나이", "부서");
						System.out.println("=====================================");
						System.out.printf("%s%10s%10d세%10s\n", userNums[i], names[i], ages[i], departments[i]);
						System.out.println("=====================================");
						break;
					}
				}
				if (i == count) {
					System.out.println("조회하신 사번의 정보가 없습니다.");
				}

			} else if (menu == 4) {
				// 수정

				// 해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				// 프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요
				// 사번 입력 -> 존제하는 사번이라면 -> [1. 나이 변경 | 2. 부서 변경 | 3. 취소]
				// 사번이 존재하지 않는다면 없다고 얘기 해주세요

				// 인덱스 찾기

				System.out.println("수정하실 직원의 사번을 입력하세요");
				System.out.print("> ");
				String empNum = sc.next();
				int i, selNum;

				for (i = 0; i < count; i++) {
					if (userNums[i].equals(empNum)) {

						break;
					}
				}
				if (i == count) {
					System.out.println("조회하신 사번의 정보가 없습니다.");
					continue;
				} else {

					System.out.println("1. 나이 변경");
					System.out.println("2. 부서 변경");
					System.out.println("3. 취소");

					selNum = sc.nextInt();
				}

				if (selNum == 1) {
					System.out.println("변경하실 나이를 입력해 주세요");
					System.out.print("> ");
					ages[i] = sc.nextInt();

				} else if (selNum == 2) {
					System.out.println("변경하실 부서를 입력해 주세요");
					System.out.print("> ");
					departments[i] = sc.next();
				} else if (selNum == 3) {
					continue;
				} else {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				}

			} else if (menu == 5) {
				// 해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				// 삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]"를 입력받아서
				// Y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				// 배열의 크기를 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				// 앞으로 한칸씩 땡긴 다음 count를 하나 내려 주시면 됩니다.

				System.out.println("삭제하실 직원의 사번을 입력하세요");
				System.out.print("> ");
				String empNum = sc.next();

				boolean flag = false;
				for (int i = 0; i < count; i++) {
					if (userNums[i].equals(empNum)) {
						System.out.printf("%s%10s%10d세%10s\n", userNums[i], names[i], ages[i], departments[i]);
						System.out.println("정말로 삭제하시겠습니까? [Y/N]");
						System.out.print("> ");
						String sel = sc.next();

						switch (sel) {
						case "Y":
						case "y":
							// 삭제기능
							for (int j = i; j < count-1; j++) {
								userNums[j] = userNums[j + 1];
								names[j] = names[j + 1];
								ages[j] = ages[j + 1];
								departments[j] = departments[j + 1];

							}
							count--;
							System.out.println("삭제가 정상적으로 진행되었습니다.");
							break;
						case "N":
						case "n":
							System.out.println("삭제가 취소되었습니다.");
							break;

						default:
							System.out.println("잘못 입력하셨습니다.");
						}

						flag = true;
					}

				}
				if (!flag)
					System.out.println("조회되지 않는 사원번호입니다.");

			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}

	}
}
