package exception.basic;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 1. 스캐너를 통해서 정수 2개를 입력받습니다.
		 2. 입력받은 값이 정수라면, 단순히 정수의 합을 출력하고
		 반복문을 종료시키세요.
		 3. 입력받은 값이 에러를 발생시키는 값이라면, "정수로만 입력하세요'
		 를 출력한 후에 다시 입력받을 수 있도록 작성해주세요.
		 4. 반복문을 탈출하면 프로그램 정상종료문장을 띄워주세요.
		 
		 (만약 nextInt()가 정수를 가지고 오지 못하는 경우
		 버퍼에 해당 쓰레기 문자가 그대로 남아있습니다.
		 그걸 걷어가 주셔야 합니다.
		 nextLine()를 통해 쓰레기 문자를 정리해야 한다.)
		 */
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		while(true) {
			
		
			try {
				System.out.print("정수 1 : ");
				a=sc.nextInt();
				
				System.out.print("정수 2 : ");
				b=sc.nextInt();
				System.out.printf("%d+%d=%d\n",a,b,a+b);
				break;
				
			} catch (Exception e) {
				System.out.println("정수로만 입력하세요");			
				sc.nextLine(); // 버퍼 지우기
			}
		}
		sc.close();
	}
}
