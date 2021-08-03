package backjoon.step01;
import java.util.Scanner;

public class Problem5 {
	/*
	 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
	예제 입력  
	1 2
	
	예제 출력
	3
	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+b);
		sc.close();
		
	}
	
}
