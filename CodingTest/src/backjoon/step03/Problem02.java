package backjoon.step03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem02 {
	/*
	 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	 * 
	 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=2*n;i++) {
			list.add(sc.nextInt());
		}
		for(int a = 0; a<list.size()-1;a=a+2) {
			System.out.printf("%d\n",list.get(a)+list.get(a+1));
		}
		sc.close();
	}
}
