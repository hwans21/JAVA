package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class LottoSimulator {
	static Random r = new Random();
	
	static int prize1 = 0; // 1등 당첨 횟수를 세 줄 변수
	static int prize2 = 0; // 2등 당첨 횟수를 세 줄 변수
	static int prize3 = 0; // 3등 당첨 횟수를 세 줄 변수
	static int prize4 = 0; // 4등 당첨 횟수를 세 줄 변수
	static int prize5 = 0; // 5등 당첨 횟수를 세 줄 변수
	static int failCnt = 0; // 꽝 횟수를 세 줄 변수
	
	
	
	
	public static int[] createLotto() {
		int[] lotto = new int[6];
//		m: for(int i=0;i<lotto.length;i++) {
//			if (i != 0) {
//				lotto[i] = r.nextInt(45) + 1;
//				for (int j = i - 1; j >= 0; j--) {
//					if (lotto[i] == lotto[j]) {
//						i--;
//						continue m;
//					}
//				}
//			} else
//				lotto[i] = r.nextInt(45)+1;
//		}
		int i = 0; // lotto배열의 인덱스
		while(i<lotto.length) {
			boolean flag = false; // 중복 여부를 알려주는 변수
			int rn = r.nextInt(45)+1;
			for(int j=0; j<=i; j++) {
				if(rn == lotto[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				lotto[i] = rn;
				i++;
			}
			
		}
		// for문은 인덱스가 무조건 하나씩 올라가므로
		// while문으로 인덱스를 원할 때 올릴 것이다.
		
		/*
		 - 난수 1~45 범위의 난수 6개를 생성하셔서
		 lotto 배열에 넣어서 리턴해 주시면 됩니다.
		 - 난수끼리는 중복이 발생하면 안됩니다.
		 - 난수를 생성한 후에 생성된 난수가 이미 배열에 있는지를
		 확인하여, 이미 존재한다면 다시 생성해서 검사해 주시고
		 존재하지 않는다면 배열에 추가해 주시면 됩니다.
		 - return 전에 배열을 정렬해서 리턴해 주세요
		 (while으로 작성했습니다. for로 작성하셔도 좋습니다.)
		 */
		Arrays.sort(lotto);
		
		return lotto;
	}
	
	// 보너스번호를 생성하는 메서드
	public static int createBonusNum(int[] win) {
		/*
		 매개값으로 전달되는 당첨번호들을 피해서
		 1~45 사이의 난수를 하나 리턴해 주시면 되겠습니다.
		 당첨번호와 중복된다면 중복되지 않을 때 까지 다시 뽑아주시면 되겠습니다.
		 (boolean변수를 활용하면 쉽습니다.)
		 */
//		boolean flag = false;
//		int bnum;
//		while(true) {
//			bnum = r.nextInt(45)+1;
//			for(int i=0; i< win.length;i++) {
//				if(win[i]==bnum) {
//					flag = true;
//					break;
//				}
//			}
//			
//			if(!flag)break;
//		}
//		return bnum;
		
		while(true) {
			boolean flag = false;
			int rn = r.nextInt(45)+1;
			for(int i: win) {
				if(rn == i) {
					flag =true;
					break;
				}
			}
			if(!flag)
				return rn;
		}
	}
	
	// 당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(int[] myLotto, int[] win, int bonus) {
		/*
		 내 로또 번호와 당첨번호 배열을 비교하여
		 일치하는 횟수를 기억해 두세요.
		 일치하는 숫자만큼 위에 선언한 static 변수의 값을
		 올려주시면 되겠습니다.
		 6개 일치 -> 1등
		 5개 일치 + 보너스번호 일치 -> 2등
		 5개 일치 -> 3등
		 4개 일치 -> 4등
		 3개 일치 -> 5등
		 나머지 -> 꽝
		 */
		
		int rCnt = 0;
		boolean bflag = false;
		for(int i=0;i<win.length;i++) {
			for(int n: win) {
				if(n==myLotto[i])rCnt++;
			}
			if(myLotto[i] == bonus) bflag = true;
		}
		if(rCnt==6)
			prize1++;
		else if(rCnt==5 && bflag)
			prize2++;
		else if(rCnt==5 && !bflag)
			prize3++;
		else if(rCnt==4)
			prize4++;
		else if(rCnt==3)
			prize5++;
		else
			failCnt++;
		System.out.printf("1등:%d|2등:%d|3등:%d|4등:%d|5등:%d|꽝:%d\n",
				prize1, prize2, prize3, prize4, prize5,failCnt);
	}

	public static void main(String[] args) {
		// 당첨번호 
		int[] raffle = createLotto();
		int bonus = createBonusNum(raffle);
		System.out.print(Arrays.toString(raffle));
		System.out.printf("[%d]\n",bonus);
		int[] myLotto = new int[6];
		// 구매
		while(true) {
			myLotto = createLotto();
			checkLottoNumber(myLotto, raffle, bonus);
			if(prize1>=1) break;
			
		}
		System.out.println(Arrays.toString(myLotto));
		System.out.print(Arrays.toString(raffle));
		System.out.printf("[%d]\n",bonus);
	}
}
