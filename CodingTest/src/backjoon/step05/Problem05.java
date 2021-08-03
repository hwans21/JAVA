package backjoon.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem05 {
/*
 * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
 * 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
 * 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
 * 예를 들어, 세준이의 최고점이 70이고, 
 * 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 3
 * 40 80 60
 * 
 * 40 -> 40/80*100 => 50점
 * 80 -> 80/80*100 => 100점
 * 60 -> 60/80*100 => 75점
 * 
 * 출력
 * 75.0
 */
	
	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		List<Double> list2 = new ArrayList<Double>();
		
		try {
			int n = Integer.parseInt(br.readLine());
			double sum = 0;
			String str = br.readLine();
			for(int i=0; i<n; i++) {
				list.add(Integer.parseInt(str.split(" ")[i]));
			}
			int max = Collections.max(list);
			for(int score : list) {
				list2.add(((double) score/max*100));
			}
			for(double d : list2) {
				sum+=d;
			}
			bw.write(Double.toString(sum / list2.size()));
			
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
