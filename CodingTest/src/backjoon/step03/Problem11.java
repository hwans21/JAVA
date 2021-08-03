package backjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem11 {

	/*
	 * 
	 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
	 * 
	 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
	 * 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
	 * 
	 * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
	 * 
	 * 입력
	 * 10 5 
	 * 1 10 4 9 2 3 8 5 7 6
	 * 
	 * 출력
	 * 1 4 2 3
	 * 
	 */
	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		try {
			String line1 = br.readLine();
			int n = Integer.parseInt(line1.split(" ")[0]);
			int x = Integer.parseInt(line1.split(" ")[1]);
			String line2 = br.readLine();
			for(int i=0;i<n;i++) {
				list.add(Integer.parseInt(line2.split(" ")[i]));
			}
			for(int a : list) {
				if(a < x)
					bw.write(a+" ");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
