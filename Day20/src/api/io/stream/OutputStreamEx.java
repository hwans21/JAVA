package api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {
		/*
		 1. 파일을 쓸 때(작성) 사용하는 클래스는 FileOutputStream입니다.
		 2. 생성자의 매개값으로 파일을 쓸 전체 경로를 지정합니다.
		 3. io패키지의 모든 클래스들은 생성자에 throws키워드가 있기 때문에
		 try-catch블록을 항상 작성해야 합니다.
		 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명: ");
		String name = sc.next();
		sc.nextLine();
		FileOutputStream fos = null;
		try {
			fos = 
				new FileOutputStream("C:\\Users\\hwans\\Develop\\eclipse-workspace\\file\\"+name+".txt");
			System.out.print("문장을 입력하세요: ");
			String str = sc.nextLine();
			byte[] arr = str.getBytes(); // 문자열 데이터를 바이트 데이터로 변형
			fos.write(arr); // 파일을 바이트단위로 써 내림.
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				//io 패키지의 경우에는 하드디스크자원을 소모하기 때문에
				// 사용한 후에는 close()를 통해 객체 반납이 권장됩니다.
				fos.close(); //fos가 null일 경우 예외가 발생할 가능성이 있음
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
