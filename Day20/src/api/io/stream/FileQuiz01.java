package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		/*
		 1. 스캐너를 통해서 파일명을 정확히 입력받습니다.(경로는 미리 완성)
		 2. file폴더에 해당 파일이 존재한다면 해당 파일을
		 upload폴더로 복사하세요.
		 파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요
		 
		 3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력하세요
		 
		 */

		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine();
		FileInputStream oldfile = null;
		FileOutputStream newfile = null;
		
		try {
			oldfile = new FileInputStream("C:\\Users\\hwans\\Develop\\eclipse-workspace\\"+filename);
			newfile = new FileOutputStream("C:\\Users\\hwans\\Develop\\eclipse-workspace\\upload\\"+filename);
			
			byte[] arr = new byte[100];
			int result = 0;
			while(true) {
				result = oldfile.read(arr);
				if(result == -1) break;
				newfile.write(arr,0,result);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못하였습니다.");
			
		} catch (IOException e) {
			System.out.println("파일 처리 도중 에러가 발생했습니다.");
		} finally {
			sc.close();
			try {
				oldfile.close();
				newfile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		FileInputStream oldFile = null;
//		FileOutputStream newFile = null;
//		
//		try {
//			System.out.print("파일명을 입력하세요 : ");
//			String name = sc.next();
//			
//			oldFile = new FileInputStream("C:\\Users\\hwans\\Develop\\eclipse-workspace\\file\\"+name);
//			newFile = new FileOutputStream("C:\\Users\\hwans\\Develop\\eclipse-workspace\\upload\\"+name);
//			
//			int result;
//			byte[] read = new byte[100];
//			
//			while((result = oldFile.read(read))!=-1) {
//				newFile.write(read,0,result);
//			}
//			System.out.println("파일 복사 성공!");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("파일을 찾을 수 없습니다.");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("파일 처리 중 에러가 발생했습니다.!");
//		} finally {
//			try {
//				oldFile.close();
//				newFile.close();
//				sc.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}
}
