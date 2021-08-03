package backjoon.step01;
import java.util.Scanner;

public class Problem10 {
	/*
	 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
	 * 
	 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
	 * 
	 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		
		
		sc.close();
	}
}
