package api.lang.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		/*
		 1. 스캐너를 통해서 id를 입력받습니다
		 2. 참고로 아이디는 공백을 포함할 수 있습니다.
		 3. 공백을 제거한 아이디가 5글자 미만이라면 다시 입력받으세요
		 4. 5글자 이상 입력되었다면 "id가 등록되었습니다." 출력 후 
		 종료하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		String id;
		while(true) {
			id = sc.nextLine().trim();
			
			if(id.replace(" ", "").length()<5) {
				System.out.println("공백제외5글자 미만입니다.");
				continue;
				
			} else
				break;
			
		}
		System.out.println("id가 입력되었습니다.");
		
		sc.close();
	}
}
