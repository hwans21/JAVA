package api.lang.math;

public class MathExample {

	public static void main(String[] args) {
		
		
		// 랜덤
		double a1 = Math.random(); // 0<=x<=1까지 랜덤으로 뽑음
		System.out.println(a1);
		double a2 = Math.random()*100; // 0<=x<=100까지 랜덤으로 뽑음
		System.out.println(a2);
		double a3 = (Math.random()*100)+1; // 
		System.out.println(a3);
		
		// 올림
		double d = Math.ceil(1.15132131);
		System.out.println(d);

		// 내림
		double b = Math.floor(1.5);
		
		System.out.println(b);
		
		//반올림(자리수 지원x)
		// 소수점을 뒤로 땡긴다(곱한다) -> 곱한만큼 나눈다.
		double d2 = Math.round(3.1345968*100)*0.01;
		System.out.println(d2);
		
		// 제곱
		double d3 = Math.pow(3.0, 4.0); // 3^4;
		System.out.println(d3);
		
		// 최대값
		int max = Math.max(2, 7);
		System.out.println(max);
		
		// 최솟값
		int min = Math.min(2, 7);
		System.out.println(min);
		
		
	}
}
