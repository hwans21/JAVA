package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("D:\\eclipse-workspace\\file\\test4.txt");
			br = new BufferedReader(fr);
			
			// BufferedReader에는 readLine() 메서드가 있고,
			// 한 줄을 통째로 읽습니다.
			String str;
			while((str= br.readLine()) != null)
				System.out.println(str);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
