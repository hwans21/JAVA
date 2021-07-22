package api.util.token;

import java.util.StringTokenizer;

public class TokenExample2 {

	public static void main(String[] args) {
		String log = "2021.05.07, 목요일, /bno=30, user=홍길동";
		
		// ,를 기준으로 자름
		StringTokenizer token1 = new StringTokenizer(log,",");
		
		while(token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
		
		System.out.println("---------------");
		
		// , . / 기준으로 자름
		StringTokenizer token2 = new StringTokenizer(log,",./");
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		System.out.println("---------------");
		
		// 구분자로 토큰을 넣을지, 구분자를 토큰에 포함시키지 않을지를 결정하는 세 번째 매개값
		// default 매개값은 false입니다.
		StringTokenizer token3 = new StringTokenizer(log, ",", true);
		
		while(token3.hasMoreTokens()) {
			System.out.println(token3.nextToken());
		}
		
		
		
		
	}
}
