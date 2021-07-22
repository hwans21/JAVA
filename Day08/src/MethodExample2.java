/*
 # 매개 변수(parameter, argument)
 
 1. 매개변수는 메서드를 호출할 때, 메서드 실행에 필요한 값들을
 메서드 내부로 전달하는 매개체 역할을 합니다.
 ※매개체 : 둘 사이에서 어떤 일을 맺어 주는 것.
 
 2. 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라
 메서드의 실행 결과는 달라질 수 있습니다.
 
 3. 매개값을 몇 개 받아 사용할지는 메서드를 선언할 때 선언부에서 
 ()안에 미리 개수와 타입을 지정합니다.
 
 4. 매개변수를 하나도 선언하지 않을 수도 있습니다. 이 때는 메서드 선언부에
 () 내부를 비워둡니다. 그리고 호출할 때도 ()를 비워서 호출합니다.
 
 5. 매개변수의 이름을 지을 때는 호출자가 선언부로 돌아와서
 매개값을 확인하지 않게, 어떠한 값을 담는 변수인지
 그 뜻을 알기 쉽게 지어주면 서로에게 좋습니다.
 
 */

public class MethodExample2 {

	static int calcRangeTotal(int start, int end) {
		int total = 0;
		int temp;
		if (start > end) {
			temp = start;
			start = end;
			end = temp;
		}
		for (int i = start; i <= end; i++) {
			total += i;
		}
		System.out.printf("%d~%d의 누적합:%d\n", start, end, total);
		return total;

	}

	// 메서드 작성요령
	// - 내부 로직을 먼저 작성을 하고 매개변수와 리턴형식을 지정할 수 있도록 함
	// 매개변수가 필요없는 경우
	static String selectRandomFood() {
		String[] food = new String[4];
		food[0] = "김밥";
		food[1] = "중국집";
		food[2] = "편의점";
		food[3] = "햄버거";

		int rn = (int) (Math.random() * 4);
		return food[rn];
	}

	// 정수 n개를 전달하면 그 정수들의 총 합을 리턴하는 메서드

	static int calcNumberTotal(int[] nums) {
		int total = 0;
		for (int i : nums) {
			total += i;
		}
		return total;
	}

	
	
	public static void main(String[] args) {
		
		
		int[] testnums = {10,30,50,70,90,1000};
		calcRangeTotal(200, 100);
		System.out.println("오늘 점심 뭐먹지???? : " + selectRandomFood());
		System.out.println("testnums배열의 합 : " + calcNumberTotal(testnums));// 배열전달방법 1
		
		int sum = calcNumberTotal(new int[] {1,2,3,4,5,6,7});// 배열전달방법 2
		System.out.println(sum);
	}
}
