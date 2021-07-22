import java.util.Arrays;

/*
  Q. 모든 메서드를 생성 후 main에서 호출해서 사용하세요
 */

public class MethodQuiz01 {

	// 1.
	static void method1() {
		System.out.println("안녕");
	}

	// 2.
	static String method2(String str) {
		return str;
	}

	// 3.
	static double method3(int n1, int n2, double f1) {
		return n1 + n2 + f1;
	}

	// 4.
	static String method4(int n1) {
//		if (n1 % 2 == 0) 
//			return "짝수";
//		 else 
//			return "홀수";
		return n1 % 2 == 0 ? "짝수" : "홀수"; // 삼항연산자

	}

	// 5.
	static void method5(String str, int n1) {
//		for (int i = 0; i < n1; i++)
//			System.out.println(str);
		int i = 1;
		while (i <= n1) {
			System.out.println(str);
			i++;
		}
	}

	// 6.
	static int maxNum(int n1, int n2) {
//		if (n1 >= n2)
//			return n1;
//		else
//			return n2;
		return n1 >= n2 ? n1 : n2;
	}

	// 7.
	// ※ 절댓값 실수에서 양의 부호(＋)와 음의 부호(－)를 뺀 값.
	// 수직선 위의 원점(0)에서 어떤 점까지의 거리이다.
	// 따라서 절댓값은 항상 0보다 크거나 같고, 0의 절댓값은 0이다.
	static int abs(int n1) {
//		if (n1 < 0)
//			return -n1;
//		else
//			return n1;

		return n1 < 0 ? -n1 : n1;
	}

	// 8.
	static int method6(int n1) {
		int total = 0;
		for (int i = 0; i <= n1; i++)
			total += i;
		return total;
	}

	// 9.
	static int method7(int[] nums) {
		return nums.length;
	}

	// 10.
	static String[] method8(String str1, String str2) {
//		String[] ret = { str1, str2 };
//		return ret;
		return new String[] { str1, str2 };
	}

	// 11.
	static String java(int n1) {
		String str = "";
		for (int i = 1; i <= n1; i++) {
			if (i % 2 != 0)
				str += "자";
			else
				str += "바";
//			str += i % 2 != 0 ? "자" : "바";

		}
		return str;
	}

	

	public static void main(String[] args) {

		// 1.
		method1();
		// 2.
		System.out.println(method2("버전 2"));
		// 3.
		System.out.println(method3(3, 4, 3.145768));
		// 4.
		System.out.println(method4(373927));
		// 5.
		method5("고구마 좋아", 5);
		// 6.
		System.out.println(maxNum(30, 68));
		// 7.
		System.out.println(abs(-70));
		// 8.
		System.out.println(method6(10));
		// 9.
		System.out.println(method7(new int[] { 3, 4, 5 }));
		// 10.
		System.out.println(Arrays.toString(method8("하이", "고구마")));

		// 11.
		System.out.println(java(7));

	}
}
