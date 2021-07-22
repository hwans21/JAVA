package lambda.quiz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		/*
		 1. BufferedReader를 사용해서 csv파일을 읽어들이세요.
		 2. ,를 기준으로 잡아서 Data객체에 한 줄 단위로 저장합니다.
		 3. list<Data>에 추가합니다.
		 
		 4. 람다식을 이용해서 지역: 서울, 짝수:월의 분양가격이 4000이상의 객체만 뽑아서
		 새로운 list를 생성
		 stream.collect(Collector.toList())
		 -> 스트림 객체의 요소를 모아서 새로운 리스트 생성
		 
		 5. 새롭게 만들어진 리스트 내부의 내용을 모두 출력해 주세요
		 */
		BufferedReader br = null;
		
		List<Data> list = new ArrayList<Data>();
		try {
			br = new BufferedReader(
					new InputStreamReader( // 인코딩을 지정해서 가져올 수 있는 클래스
							new FileInputStream("C:\\Users\\hwans\\Downloads\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv"),"EUC-KR"));
			String str;
			String[] strs;
			while((str=br.readLine())!=null) {
				strs = str.split(",");
				System.out.println(Arrays.toString(strs));

				String price;
				try {
					price = strs[4].replace(" ", "").replace("-", "").equals("")?"0":strs[4];
				} catch (Exception e) {
					// TODO: handle exception
					price = "0"; // 필드값이 없어서 array값이 4개일 경우 에러가 발생!
				}
				
				list.add(new Data(strs[0],strs[1],strs[2],strs[3],price));
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
