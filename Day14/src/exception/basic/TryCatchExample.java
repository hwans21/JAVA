package exception.basic;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		int i;
		int j;

		Scanner sc = new Scanner(System.in);

		System.out.println("나눗셈 시작!");
//		System.out.printf("%d / %d = %d\n",i,j,i/j);
		try { // try블록에는 예외 발생 가능성이 있는 코드를 작성합니니다.
			System.out.print("정수1 :");
			i = sc.nextInt();
			System.out.print("정수2 :");
			j = sc.nextInt();
			System.out.printf("%d / %d = %d\n", i, j, i / j);

		} catch (Exception e) {// 객체
			// catch블록에는 try블록에서 실제 예외가 발생했을 시에
			// 실행할 코드를 작성합니다.
			System.out.println("0으로 나누지 마세요!");
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 정상 종료!");
		sc.close();
	}
}
