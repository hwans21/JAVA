package backjoon.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem04 {
/*
 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
 * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
 * 수  10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
 * 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 * 
 * 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 
 * 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 * 
 * 
 */
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> temp = new ArrayList<Integer>();
		boolean flag = true;
		try {
			for(int i=0;i<10;i++) {
				list.add((Integer.parseInt(br.readLine()))%42);
			}
			for(int i=0; i<list.size(); i++) {
				for(int n : temp) {
					if(n == list.get(i)) {
						flag=false;
						break;
					}
				}
				if(!flag) {
					flag = true;
					continue;
				}
				temp.add(list.get(i));
				
			}
			bw.write(Integer.toString(temp.size()));
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
