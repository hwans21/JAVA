package api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("주민등록번호를 입력하세요: ");
			String jumin = sc.next();
			if (jumin.length() != 14) {
				System.out.println("-을 포함해서 입력해주세요");

				continue;

			}
			
			String year = jumin.substring(0, 2);
			String month = jumin.substring(2,4);
			String day = jumin.substring(4, 6);
			String gender = jumin.substring(7,8);


			int yearnum = Integer.parseInt(year);
		
			switch (Integer.parseInt(gender)) {
				case 1:{
					gender = "남자";
					yearnum += 1900;
					break;
				}
				case 2:{
					
					gender = "여자";
					yearnum += 1900;
					break;
				}
				case 3:{
					gender = "남자";
					yearnum+=2000;
					break;
				}
				case 4:{
					
					gender = "여자";
					yearnum+=2000;
					break;
				}
				
				default:{
					System.out.println("잘못된 주민등록번호입니다.");
					
					throw new IllegalArgumentException("Unexpected value: " + gender);
				}
			}
			
			System.out.println(yearnum+"년 "+ month + "월 " + day + "일 " + (2021-yearnum+1)+"세 "
					+gender);
			break;
			
			
		}
		sc.close();
	}

}
