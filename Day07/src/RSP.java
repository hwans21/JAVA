import java.util.Scanner;

public class RSP {
	public static void main(String[] args) {
		/*
		 * 가위바위보 컴퓨터랑 함 컴퓨터는 랜덤으로 냄 가위는 보를 이김 보는 바위를 이김 바위는 가위를 이김 이김 : 비김: 짐을 세서 보여줄 수
		 * 있어야함 코인 개수를 세서 게임을 진행할 때 마다 까고 충전을 하면 늘릴 수 있어야함
		 * 
		 * 메뉴 1. 게임진행 2. 코인충전 3. 게임기록 4. 게임종료
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		String[] rsp = new String[3];
		rsp[0] = "바위";
		rsp[1] = "가위";
		rsp[2] = "보";
		int coin = 0;

		while (true) {

			System.out.printf("\n코인개수 : %d\n", coin);
			System.out.println("=====가위바위보=====");
			System.out.println("1. 게임진행"); // 
			System.out.println("2. 코인충전"); // v
			System.out.println("3. 게임기록"); //
			System.out.println("4. 게임종료"); // v
			System.out.println("메뉴를 입력하세요");
			System.out.print("> ");
			int selmenu = sc.nextInt();
			switch (selmenu) {
			case 1:

				if(coin == 0) {
					System.out.println("코인이 부족합니다.");
					System.out.println("코인을 충전해주세요");
					continue;
				}
				boolean flag = false;
				System.out.println("게임을 진행합니다.");
				System.out.println("'가위', '바위', '보' 중 선택해서 입력하세요");
				System.out.println("만일 게임을 도중에 그만하시려면 '그만'이라고 입력하세요");
				while(true) {
					System.out.print("입력 > ");
					String perrsp = sc.next();
					int comrsp = (int) (Math.random() * rsp.length);
				
					if(flag)break;
					else if(coin == 0) {
						System.out.println("코인이 부족합니다.");
						System.out.println("게임을 종료하고 메인메뉴로 돌아갑니다.");
						break;
					}
					
					switch (perrsp) {
					case "가위":
						System.out.printf("컴퓨터 : %s \n사용자 : %s\n", rsp[comrsp], perrsp);
						if(rsp[comrsp].equals(perrsp)) { // 비김
							System.out.println("비겼습니다.");
						}
						else if(rsp[comrsp].equals("바위")) { // 짐
							System.out.println("졌습니다.");
						}
						else { // 이김
							System.out.println("이겼습니다.");
						}
						coin--;
							
							
						break;
						
					case "바위":
						System.out.printf("컴퓨터 : %s \n 사용자 : %s\n", rsp[comrsp], perrsp);
						if(rsp[comrsp].equals(perrsp)) { // 비김
							System.out.println("비겼습니다.");
						}
						else if(rsp[comrsp].equals("보")) { // 짐
							System.out.println("졌습니다.");
						}
						else { // 이김
							System.out.println("이겼습니다.");
						}
						coin--;
						break;
						
					case "보":
						System.out.printf("컴퓨터 : %s \n 사용자 : %s\n", rsp[comrsp], perrsp);
						if(rsp[comrsp].equals(perrsp)) { // 비김
							System.out.println("비겼습니다.");
						}
						else if(rsp[comrsp].equals("가위")) { // 짐
							System.out.println("졌습니다.");
						}
						else { // 이김
							System.out.println("이겼습니다.");
						}
						coin--;
						break;
					case "그만":
						System.out.println("메뉴로 돌아갑니다.");
						flag = true;
						break;
						
					default:
						System.out.println("잘못된 입력입니다. 다시 입력해주세요");
						break;
					}
				}
				break;
			case 2:
				System.out.println("코인을 투입해주세요");
				System.out.print("투입할 코인 개수 : ");
				int coincheck = sc.nextInt();
				if (coincheck < 0) {
					System.out.println("코인을 빼가시면 안되요");

				} else {
					coin += coincheck;
				}
				break;
			case 3:

				break;
			case 4:
				System.out.println("게임을 종료합니다.");
				return;

			default:
				System.out.println("잘못된 입력입니다.");
			}
		}

	}
}
