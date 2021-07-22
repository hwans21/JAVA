package obj_array;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		/*
		 - Score객체를 담을 수 있는 배열을 선언하세요.
		 배열의 크기는 넉넉하게 100개로 하겠습니다.
		 
		 - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
		 입력받은 후 입력받은 점수를 토대로 Score 객체를 생성하세요.
		 총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
		 
		 객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
		 이름 입력란에 '그만'이라고 입력하면 반복문을 종료시켜 주세요
		 
		 - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 이용하여
		 scoreInfo()를 모두 불러주세요(반복문)
		 ※) 중간에 그만 두게 된다면 배열의 나머지 인덱스는 
		 모두 null로 가득 차 있습니다. null.scoreInfo()는 X!!!
		 
		 
		 
		 */
		
		Score[] score = new Score[100];
		Scanner sc = new Scanner(System.in);
		int count = 1;
		System.out.println("*** 학생 점수 입력 ***");
		System.out.println("'그만'을 입력하시면 종료됩니다.");
		for(int i=0; i<score.length; i++) {
			System.out.printf("----------%d번째 학생--------\n", count);
			String str;
			
			System.out.printf("이름 : ");
			str = sc.next();
			if(str.equals("그만")) {
				System.out.println("입력을 종료합니다.");				
				break;
			}
			
			score[i] = new Score();
			
			
			score[i].setName(str);
			
			System.out.printf("국어 : ");
			score[i].setKor(sc.nextInt());
			
			System.out.printf("영어 : ");
			score[i].setEng(sc.nextInt());
			
			
			System.out.printf("수학 : ");
			score[i].setMath(sc.nextInt());
			count++;
		}
		
		for(Score student : score) {
			if(student == null)
				break;
			student.scoreInfo();
		}
		
		sc.close();
		
	}
	/*
	 * 향상 for문은 모든 정보를 출력할 때만 쓰고 아니라면 기존 for문을 사용
	 * 입력받을 때 향상for문 써서 
	 */
}
