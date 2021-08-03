package backjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem04 {
	/*
	 * 첫 줄에 테스트케이스의 개수 T가 주어진다. 
	 * T는 최대 1,000,000이다. 
	 * 다음 T줄에는 각각 두 정수 A와 B가 주어진다. 
	 * A와 B는 1 이상, 1,000 이하이다.
	 */
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		List<Integer> list = new ArrayList<>();
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int num = Integer.parseInt(br.readLine());
			for(int i=1; i<=num;i++) {
				String s = br.readLine();
				String[] arr = s.split(" ");
				list.add(
						Integer.parseInt(arr[0])+
						Integer.parseInt(arr[1])						
					);
				
			}
			for(int n : list) {
				bw.write(n+"\n");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
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
