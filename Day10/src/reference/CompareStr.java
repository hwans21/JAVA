package reference;

import java.util.Scanner;

public class CompareStr {
	public static void main(String[] args) {
		
		String str = "1";
		String str2 = "1";
		System.out.println(str == str2);
		/*
		 주소값을 비교하는데 true가 나오는 이유
		 
		 처음 string 객체를 사용하여 만드는데
		 2번째 나올때는 이미 있는 string 객체를 참조하게 한다
		 
		 따라서 문자열 비교할 떄에는 equals를 사용하자
		 */
		
		User kim = new User("asdf","1234");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("비밀번호를 입력해주세요");
		
		String passwd = sc.next();
		
		System.out.println("내가 방금 입력한 비번: "+passwd);
		System.out.println("가입당시 입력한 비밀번호 : " +kim.passwd);
		
		System.out.println("----------------------");
		
		System.out.println("== 연산자의 결과는 : "+ (passwd == kim.passwd));
		System.out.println("equals 연산자의 결과는 : "+ (passwd.equals(kim.passwd)));
		
	}
}
