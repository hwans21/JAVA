package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodManager {

	public static void main(String[] args) {
	
		Map<String, Integer> foods = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("*** 음식점 메뉴판 관리프로그램 ***");
			
			System.out.println("#1. 메뉴 등록");
			System.out.println("#2. 메뉴 전체보기");
			System.out.println("#3. 프로그램 종료");
			System.out.print(">");
			try {
				int menu = sc.nextInt();

				System.out.println("-------------------");

				if (menu == 1) {
					System.out.println("등록할 메뉴명을 입력해 주세요");
					System.out.print(">");
					String food = sc.next();

					if (foods.containsKey(food)) {
						System.out.println("이미 존재하는 메뉴입니다.");
						continue;
					}
					System.out.println("가격을 입력해 주세요");
					System.out.print(">");
					int price = sc.nextInt();

					foods.put(food, price);
					System.out.printf("%s 메뉴가 등록되었습니다.\n", food);

					/*
					 * - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다. 이미 존재하는 메뉴명이 들어왔다면 '이미 존재흐는 메뉴입니다.' 를 출력하시고
					 * 메인메뉴로 돌아와 주세요 - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
					 */

				} else if (menu == 2) {
					if (foods.size() == 0) {
						System.out.println("메뉴부터 먼저 등록해 주세요!");
						continue;

					}
					for (String k : foods.keySet()) {
						System.out.printf("%s : %s\n", k, foods.get(k));
					}
					System.out.println("1. 수정 | 2. 삭제 | 3. 취소");
					System.out.print(">");
					int submenu = sc.nextInt();
					String search;
					if (submenu == 1) {
						System.out.println("수정할 메뉴명을 입력해주세요");
						System.out.print(">");
						search = sc.next();
						if (!foods.containsKey(search)) {
							System.out.println("해당 메뉴명이 존재하지 않습니다.");
							continue;
						}
						System.out.println("가격을 입력하세요");
						System.out.print(">");
						foods.put(search, sc.nextInt());
					} else if (submenu == 2) {
						System.out.println("삭제할 메뉴명을 입력해주세요");
						System.out.print(">");
						search = sc.next();
						if (!foods.containsKey(search)) {
							System.out.println("해당 메뉴명이 존재하지 않습니다.");
							continue;

						}
						foods.remove(search);
					} else if (submenu == 3) {
						continue;
					}

					/*
					 * - 만약 메뉴가 하나도 등록되어 있지 않다면 '메뉴부터 먼저 등록해 주세요!' 출력후 메인 메뉴로 이동시켜 주세요 - Map의 모든 요소를
					 * 반복문을 이용하여 출력해 주세요 ex) 메뉴명 : 가격 메뉴명 : 가격 메뉴명 : 가격....
					 * 
					 * 메뉴를 모두 출력 후에 선택지를 제공하세요 (1. 수정 | 2. 삭제 | 3. 취소) - 수정 : 수정할 메뉴명을 입력받아서 가격 수정을
					 * 진행하세요. 없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동
					 * 
					 * - 삭제 : 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요 없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동
					 * 
					 * - 취소 : 메인 메뉴로 이동
					 * 
					 */

				} else if (menu == 3) {

					System.out.println("종료하시겠습니까? (Y/N)");
					System.out.print(">");
					if (sc.next().toLowerCase().equals("y")) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
					System.out.println("종료를 취소합니다.");

					/*
					 * - Y/N를 입력받아서 Y가 입력되면 프로그램 종료 그 이외의 값은 종료 취소를 진행해 주세요
					 */
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력값입니다.");
			}
			
		}
		sc.close();
	}
	
	/*
	 
	 */
}
