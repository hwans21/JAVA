package backjoon.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem07 {
/*
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 
 * 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
 * 이어서 N명의 점수가 주어진다. 
 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 
 * 입력
 * 5
 * 5 50 50 70 80 100
 * 7 100 95 90 80 70 60 50
 * 3 70 90 80
 * 3 70 90 81
 * 9 100 99 98 97 96 95 94 93 91
 * 
 * 출력
 * 40.000%
 * 57.143%
 * 33.333%
 * 66.667%
 * 55.556%
 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<String>();
		
		try {
			int c = Integer.parseInt(br.readLine());
			for(int i=0;i<c;i++) {
				list.add(br.readLine());
			}
			for(String str : list) {
				int n = Integer.parseInt(str.split(" ")[0]);
				double avg = 0.0;
				int count = 0;
				for(int i=1;i<=n;i++) {
					avg += Double.parseDouble(str.split(" ")[i]);
				}
				avg = avg/n;
				for(int i=1;i<=n;i++) {
					if(Integer.parseInt(str.split(" ")[i]) > avg) count++;
				}
				System.out.printf("%.3f%%\n",((double) count/n*100));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
