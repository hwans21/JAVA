package exception.basic;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		/*
		 * - 난수 2개 생성해서 덧셈 문제를 내시면 됩니다.(1~100) - 만약 정답을 입력하는 곳에 정수가 아닌 문자열 등을 입력했을 시 잘못
		 * 입력했다고 출력을 해주시고, 잘못 입력한 횟수를 세 주세요 - 사용자가 0을 입력하면 프로그램이 종료됩니다. 정답 횟수와, 오답 횟수,
		 * 잘못 입력한 횟수도 출력해주세요.
		 */

		int correctCount = 0;
		int wrongCount = 0;
		int errorCount = 0;
		int solve = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num1 = (int) (Math.random() * 100) + 1;
			int num2 = (int) (Math.random() * 100) + 1;
			int answer = num1 + num2;
			System.out.printf("%d+%d=?\n", num1, num2);
			System.out.print("> ");
			try {
				solve = sc.nextInt();
			} catch (Exception e) {

				System.out.println("오류입니다.");
				errorCount++;
				sc.nextLine();
				continue;
			}
			if (solve == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (answer == solve) {
				System.out.println("정답입니다.");
				correctCount++;
			} else {
				System.out.println("오답입니다.");
				wrongCount++;
			}

		}
		System.out.printf("맞힌개수 : %d | 틀린개수 : %d | 오류개수 : %d\n", correctCount, wrongCount, errorCount);
		sc.close();
	}
}
