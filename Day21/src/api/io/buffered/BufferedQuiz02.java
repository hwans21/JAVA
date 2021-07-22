package api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BufferedQuiz02 {

	public static void main(String[] args) {
		/*
		 1. date클래스를 이용해서 file폴더 내에 하위 경로로
		 오늘 날짜 20210512file 이라는 이름으로 폴더를 생성하세요.
		 
		 2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
		 
		 3. '그만'이라고 입력할 때까지 엔터를 포함해서 실시간으로 파일을 작성합니다. 
		 (write()로 작성하고 flush()로 밀어내세요)
		 
		 
		 4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 파일을 읽어서 콘솔에 출력해 보세요
		 
		 */
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		File folder = new File("J:\\eclipse-workspace\\file\\"+sdf.format(date)+"file");
		if(!folder.exists())
			folder.mkdir();
		else
			System.out.println("이미 존재하는 폴더입니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 : ");
		String filename = sc.nextLine();
		String text; // 내용입력할 변수
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
//		FileReader fr = null;
//		BufferedReader br = null;
//		sc.nextLine(); // 첫문장 삭제됨 왜?
		try {
			fw = new FileWriter("J:\\eclipse-workspace\\file\\"+sdf.format(date)+"file\\"+filename+".txt");
			bw = new BufferedWriter(fw);
//			bw = new BufferedWriter(bw); // 매개변수에 bw를 넣어서 에러발생
			//Exception in thread "main" java.lang.NullPointerException: 
			//Cannot invoke "java.io.BufferedWriter.close()" because "bw" is null
			
			while(true) {
					
				text = sc.nextLine();
				if(text.equals("그만"))break;
				text+="\r\n";
				bw.write(text);
				bw.flush();
			
				
				
			}
		} catch (IOException e) {
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
		}
		
		
		////////////////////////////파일 읽기/////////////////////
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("J:\\eclipse-workspace\\file\\"
			+sdf.format(date)+"file\\"+filename+".txt"));
			
			String temp;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
