package api.util.token;

import java.util.StringTokenizer;

public class TokenExample {

	public static void main(String[] args) {
		/*
		 * # String Tokenizer 클래스 - 문자열을 토큰화해서 그 문자를 기준으로 잘라서 사용할 수 있는 객체 - 토큰 : 분리된
		 * 문자열의 조각 하나의 문자열을 여러 개의 토큰 조각으로 분리해 주는 클래스
		 * 
		 */
		String str1 = "오늘 날씨는 흐리고, 비가 옵니다";
		String str2 = "2021/05/07";

		StringTokenizer token1 = new StringTokenizer(str1);
		
		// 토큰 사용 전에 몇 개의 토큰이 있는지 검사
		System.out.println(token1.countTokens());
		
		while(token1.hasMoreTokens()) { // 검사할 다음 토큰이 있다면 true 반환
			System.out.println(token1.nextToken());
		}
		
		System.out.println("---------------");
		
		// 생성자의 매개값으로 기준을 정해 주시면 해당 기준으로 토큰을 분리
		// 아무값도 주지 않는다면 공백을 기준으로 분리
		StringTokenizer token2 = new StringTokenizer(str2, "/");
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
	}
}
