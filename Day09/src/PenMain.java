/*
 설계도에 작성한 속성과 기능을 사용하려면
 반드시 실체(객체)를 생성하셔야 합니다

 객체 생성 문법: 클래스타입 변수명 = new 클래스이름
 참조 연산자(.)를 통해 객체로 접근한 후
 속성을 지정하고 기능을 사용할 수 있습니다.
 */


public class PenMain {

	public static void main(String[] args) {
		Pen redPen = new Pen();
		
		
		redPen.color = "빨강";
		redPen.price = 900;
		
		Pen bluePen = new Pen();
		
		bluePen.color = "파랑";
		bluePen.price = 1000;
		
		redPen.write();
		bluePen.write();
		
		redPen.priceInfo();
		bluePen.priceInfo();
		
		Pen testPen = new Pen();
		
		testPen.write();
		testPen.priceInfo();
		
		System.out.println(redPen);
		System.out.println(bluePen);
		System.out.println(testPen);

		
		
	}
}
