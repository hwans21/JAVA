package api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BufferedQuiz {

	public static void main(String[] args) {
		/*
		 1. Date클래스와 SimpleDateFormat클래스를 활용하여
		 file경로에 20210512.txt이름으로 파일을 씁니다.
		 
		 2. 내용은 아무거나 작성하셔도 무방합니다.
		 3. 파일을 정상적으로 썼다면 BufferedReader를 통해 
		 파일을 읽어들이세요.
		 */
		
		String str = "안녕하세요. 오늘 날씨가 참 좋네요~";
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		
		FileReader fr=null; 
		BufferedReader br=null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		// 버퍼의 공간 : 1024byte
		try {
			fw = new FileWriter("J:\\eclipse-workspace\\file\\"+today+".txt");
			bw = new BufferedWriter(fw);
			
			
			
			bw.write(str);
//			bw.flush(); // 버퍼에 있는 값을 비워줘야 아래 문장이 실행이 됨
//			fr = new FileReader("J:\\eclipse-workspace\\file\\"+today+".txt");
//			br = new BufferedReader(fr);
//			
//			String temp;
//			
//			while((temp = br.readLine())!=null) {
//				System.out.println(temp);
//			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}// 파일 생성
		
		try {
			//위에서 close()함수를 통해 flush()가 자동으로 호출이 되므로 아래 문장이 실행이 되었다.
			fr = new FileReader("J:\\eclipse-workspace\\file\\"+today+".txt");
			br = new BufferedReader(fr);
			
			String temp;
			
			while((temp = br.readLine())!=null) {
				System.out.println(temp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} // 파일 읽기
		
	}
}
