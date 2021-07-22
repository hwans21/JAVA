package api.lang.math;

public class MathQuiz {

	
	static int page(int num) {
	
		int a = (int)(Math.ceil(num/10.0));
		return a;
	}
	public static void main(String[] args) {
		/*
		 Math.ceil을 사용해서 1~10이 전달되면 1이 반환되는 
		 page 메서드를 선언해 보세요 (static)
		 - 11~20이 전달되면 2가 반환되면 됩니다.
		 - 21~30이 전달되면 3이 반환되면 됩니다.
		 ※게시판 하단 페이지 네비게이션 공식
		 
		 */
		System.out.println(page(5));

	}

}
