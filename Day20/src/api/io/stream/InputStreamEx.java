package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		/*
		 1. 파일을 읽어들이는 데 사용하는 클래스는 FileInputStream입니다.
		 2. 생성자의 매개값으로 읽어들일 파일의 전체 경로를 적습니다.
		 3. InputStream도 마찬가지로 생성자에 throws가 있기 때문에
		 try-catch 안에서 사용합니다.
		 */
		
		FileInputStream fis = null;
		try {
			fis = 
					new FileInputStream("C:\\Users\\hwans\\Develop\\eclipse-workspace\\file\\test.txt.txt");
			
//			while(true) {
//				int data = fis.read(); // 1바이트 단위로 읽어들임
//				System.out.print((char) data); // 숫자형을 문자형으로 변환 출력
//				if(data==-1) break; // read()메서드가 더 이상 읽을 값이 없다면 -1을 반환
//			}
			
			
			byte[] arr = new byte[100];
			int result = fis.read(arr); // 100바이트 단위로 읽어들임
			System.out.println("읽어들인 데이터 길이 : "+result);
			System.out.println(Arrays.toString(arr));
			
			for(byte b : arr) {
				if(b==0)break;
				System.out.print((char) b);
			}
			
//			int i=0;
//			while(true) {
//				if(arr[i] == 0)break;
//				System.out.print((char) arr[i]);
//				i++;
//			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
