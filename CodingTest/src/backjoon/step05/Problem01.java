package backjoon.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem01 {
/*
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
 * 모든 정수는 -1,000,000보다 크거나 같고, 
 * 1,000,000보다 작거나 같은 정수이다.
 * 
 * 입력
 * 5
 * 20 10 35 30 7
 * 
 * 출력
 * 7 35
 * 
 */
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = -1000000;
		int min = 1000000;
		try {
			int n = Integer.parseInt(br.readLine());
			String[] arr = br.readLine().split(" ");
			for(int i=0; i<n;i++) {
				int temp = Integer.parseInt(arr[i]);
				if(temp>max) max = temp;
				if(temp<min) min = temp;
			}
			bw.write(min+" "+max);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
