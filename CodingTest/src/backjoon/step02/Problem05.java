package backjoon.step02;

import java.util.Scanner;

public class Problem05 {
	/*
	 * 10 10
	 * 9 25
	 * 
	 * 0 30
	 * 23 45
	 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int H = sc.nextInt();
		 int M = sc.nextInt();
		 M = M - 45;
		 
		 if(M < 0) {
			 M = 60 + M;
			 H--;
		 }
		 if(H < 0)
			 H=23;
		 System.out.printf("%d %d\n",H,M);
		 sc.close();
	}
}
