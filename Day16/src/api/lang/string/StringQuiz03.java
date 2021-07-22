package api.lang.string;

import java.util.Scanner;

public class StringQuiz03 {

	public static String palindrome(String word) {
		word.replace(" ", "");
		word.toLowerCase();
//		for(int i=0; i<word.length()/2;i++) {
//			if(word.charAt(i) != word.charAt(word.length()-i-1)) {
//				return "회문이 아닙니다.";
//				
//			}
//		}
		
//		String word2 = "";
//		for(int i=word.length()-1;i>=0;i--)
//			word2+=word.charAt(i);
//		if(!word.equals(word2))
//			return "회문이 아닙니다.";
		
		
		StringBuilder sb = new StringBuilder(word);
		if(!sb.reverse().toString().equals(word)) {
			return "회분이 아닙니다.";
		}
		
		return "회문입니다.";
		
	}
	
	/*
	 사용자로부터 단어를 하나 입력받고
	 해당 단어가 회문이라면 "회문입니다"를 출력
	 회문이 아니라면 "회문이 아닙니다."를 출력하세요
	 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장
	 일단 공백이 있다면 공백부터 다 없애기
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회문을 입력하세요");
		System.out.print(">");
		String str = sc.nextLine();
		System.out.println(palindrome(str));
		sc.close();
	}
}
