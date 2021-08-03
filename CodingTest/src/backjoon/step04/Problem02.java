package backjoon.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem02 {

	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		try {
			String line;
			while((line = br.readLine()) != null) {
				int a = Integer.parseInt(line.split(" ")[0]);
				int b = Integer.parseInt(line.split(" ")[1]);
				list.add(a+b);
			}
			for(int n : list) {
				bw.write(n+"\n");
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
