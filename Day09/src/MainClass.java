/*
  - 객체를 생성하지 않았을 때의 예시를 보고
  빵 객체를 생성할 수 있는 클래스(설계도)를 작성해 보세요
  클래스 이름은 Bread로 통일하겠습니다.
  
  - MainClass에서 똑같이 피자빵, 초코케이크의 
  정보를 호출해 보세요(생성자는 여러분들 맘대로~)
 */
public class MainClass {

	public static void main(String[] args) {
		Bread pizzaBread = new Bread(500, "피자빵", "밀가루");
		Bread chocoCake = new Bread(1500, "초코케이크", "초콜렛");
//		Bread blank = new Bread();
		
		pizzaBread.info();
		System.out.println("=======================");
		chocoCake.info();
		System.out.println("=======================");
//		blank.info();
	}
}
