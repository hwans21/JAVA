package api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) {
		/*
		 - 문자를 써서 저장할 때 사용하는 클래스 FileWriter입니다.
		 - 기본적으로 2바이트 단위로 처리하기 때문에 문자쓰기에 적합합니다.
		 
		 */
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\Users\\hwans\\Develop\\eclipse-workspace\\test3.txt");
			
			// \r: 캐리지 리턴 -> 커서를 맨 앞으로 땡기는 동작.
			// \n: 줄 개행(줄바꿈)
			String str = "오늘은 5월 11일 입니다. 화요일입니다. \r\n왜 화요일밖에 안됐지?";
			
			fw.write(str);
			System.out.println("파일이 정상적으로 저장되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
