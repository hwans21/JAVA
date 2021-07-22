import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulet {

	public static void main(String[] args) {
		/*
		 * 게임 인원은 2~4명 더 많다면 강제종료됨 실탄 갯수 : 6발 모두 넣으면 100% 첫 주자는 죽기 때문에 최대 5발로 제한 탄창은 6개
		 * 입니다. 게임 진행 방식 게임이 시작되면, 시작인원은 랜덤으로 설정됩니다. 또한 총알의 위치도 랜덤으로 진행됩니다. - 한명이 사망하면
		 * 총알의 위치를 랜덤으로 바꿀 생각입니다. (이 조건은 원하시는 대로 수정하셔도 상관 없습니다.) 방아쇠를 당길 때마다 총알의 위치를 바꾸는
		 * 것도 무관 - 총알의 위치는 boolean 타입의 배열로 선언해서 배치했습니다.
		 */
		/*
		 * 최후의 1인이 남을 때 까지 게임을 진행 해 주세요 또는 총알이 다 떨어져도 게임은 끝납니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("게임 인원(2~4명)--> ");
		int playerNum = sc.nextInt();

		if (playerNum < 2 || playerNum > 4) {
			System.out.println("게임 인원이 올바르지 않습니다.\n 게임을 종료합니다.");
			sc.close();
			return; // main 함수 종료.
		}

		System.out.println("\n플레이어의 이름을 등록합니다.");
		String[] players = new String[playerNum];
		for (int i = 0; i < playerNum; i++) {
			System.out.printf("%d번 플레이어 이름: ", i + 1);
			players[i] = sc.next();
		}

		System.out.println(Arrays.toString(players) + "참가!");

		System.out.print("\n 실탄 개수 (6미만) --> ");
		int bullet = sc.nextInt();
		sc.nextLine();

		if (bullet < 1 || bullet > 5) {
			System.out.println("실탄 수가 올바르지 않습니다. \n 게임을 종료합니다.");
			sc.close();
			return; // main 함수 종료.
		}

		System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");
		boolean[] bulletPos = new boolean[6]; // 6발짜리 리볼버
		int checkCount = 0; // 실탄을 정확하게 장전한 횟수;
		while (checkCount < bullet) {
			int position = (int) (Math.random() * bulletPos.length);
			if (bulletPos[position])
				continue;
			else {
				bulletPos[position] = true;
				checkCount++;
			}
		}

		int startIdx = (int) (Math.random() * playerNum);
		System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[startIdx]);

		while (true) {
			int realBulletPos = (int) (Math.random() * bulletPos.length); // 탄창을 돌림
			System.out.printf("남은총알 : %d발\n", bullet);
			System.out.printf("\n\n[%s의 턴]\t탄창을 무작위로 돌렸습니다.\n", players[startIdx]);
			System.out.println("# 엔터를 누르면 격발합니다");
			sc.nextLine();

			if (bulletPos[realBulletPos]) {
				System.out.printf("\n빵!!! [%s] 사망... \n", players[startIdx]);

				// 죽은사람 치우기
				for (int i = startIdx; i < playerNum - 1; i++) {
					players[i] = players[i + 1];
				}
				playerNum--;
				if (startIdx == playerNum)
					startIdx = 0;
				String[] temp = new String[playerNum];
				for (int i = 0; i < playerNum; i++) {
					temp[i] = players[i];
				}
				players = temp;
				temp = null;

				bulletPos[realBulletPos] = false; // 실탄이 있던 포지션은 썻으므로 사라짐
				bullet--; // 실탄 하나 빠짐

				// 생존자 체크
				System.out.println(Arrays.toString(players) + "생존했습니다.");
				// 게임 종료 여부 체크

				if (players.length == 1) { // 생존자 1명 남았을 경우
					System.out.printf("최후 생존자 : %s \n", players[0]);
					System.out.println("게임을 종료합니다.");
					break;
				} else if (bullet == 0) { // 총알을 다 사용했을 경우
					System.out.println("총알이 다 떨어졌습니다.");
					System.out.println("최후 생존자 : " + Arrays.toString(players));
					System.out.println("게임을 종료합니다.");
					break;
				} else {
					System.out.println("\n남은인원이 게임을 계속합니다.");
					
				}

			} else {
				System.out.println("휴... 살았습니다.");
				startIdx++;
				if (startIdx == players.length) {
					startIdx = 0;
				}
			}

		}
		sc.close();
	}
}
/*
 * 사망햇을경우 플레이어 줄고 실탄 하나 사라짐
 * 
 * 플레이어가 한명 남거나 실탄이 떨어진 경우 게임 종료
 * 
 * 
 * ----------오류 발생 ----------
 * 
 * 지금 첫 시작시 엔터키를 누르지 않았는데도 발사가 자동으로 됨 다음 사람부턴 엔터키를 눌러야 발사가 됨
 * 
 * 검색 자바 nextline 스킵 해결 총알갯수 입력하는부분 밑에 sc.nextLine();을 입력해서 해결
 * >> 원인
 *  - 플레이어 이름을 등록할 때 next()함수를 썼는데 이 함수는 공백이나 엔터값을 못받고 
 *  버퍼라는 곳에 저장시킨 후 다음 스캔함수가 사용을 함으로 써 자동 실행이 됬음
 *  따라서 버퍼에 저장되있는 개행 문자를 없애기 위해 반복문 진입직전 nextLine()함수를 사용했다
 * 
 * 문제 생김 참가자 중 마지막 사람만 죽었을 때 ArrayIndexOutOfBoundsException 에러가 발생 예) Q, W, E,
 * R중 R이 죽고 나머지 생존시
 * 
 * 해결 죽은사람 치우고 나서 startIdx가 playerNum이랑 같은지 확인 마지막사람이 죽었으므로 같다면 startIdx를 0으로
 * 초기화
 * 
 */