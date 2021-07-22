package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		/*
		 # 정규 표현식(regular expression)
		 - 특정한 규칙을 가진 문자열의 집합을 표현하는 데 사용하는 형식언어
		 - 지정한 패턴과 일치하는 문자열을 검색할 수 있다.
		 
		 
		 # Pattern 클래스
		 - 정규표현식을 다루는 클래스
		 
		 # Matcher 클래스
		 - 패턴을 이용하여 대상 문자열을 검색할 때 사용하는 클래스
		 
		 */
		
		String info = "30세/서울시 강남구/02-123-4567/010-2345-6789/kkk@naver.com";
		
		//전화번호 형식
		
		//\\d: 숫자 형태인지를 파악
		//\\d{3}: 숫자 3개를 찾음
		//\\d{3,4}: 숫자가 3이상 4개이하를 찾음
		
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(info);
		
		while(m.find()) { //info문자열에서 정규표현 패턴을 찾아서 true, false로 반환
			System.out.println("찾은 인덱스: "+m.start());
			System.out.println("끝 인덱스: "+m.end());
			System.out.println("찾은 값: "+m.group());
			
			
		}
		
		//이메일 형식
		/*
		 \\w: 영문자와 숫자를 찾음
		 \\w+: 영문자와 숫자 여러개
		 
		 */
		String pattern2 = "\\w+@\\w+.\\w+";
		
		Matcher m2 = Pattern.compile(pattern2).matcher(info);
		
		while(m2.find()) {
			System.out.println("찾은 인덱스: "+m2.start());
			System.out.println("끝 인덱스: "+m2.end());
			System.out.println("찾은 값: "+m2.group());
			
			
		}
		
	}
}
