package this_super;

/*
 # 자식 클래스, 하위 클래스(Child, Sub class)
 
 - 부모 클래스로부터 멤버변수(필드)와 메서드를 물려받는 클래스를
 자식 클래스라고 합니다.
 
 - 상속을 적용시키려면 자식 클래스 선언부의 클래스 이름 뒤에
 키워드 extends를 쓰고, 물려받을 부모 클래스의 이름을 적으시면 됩니다.
 
 */
public class Warrior extends Player{
	int rage;
//	void characterInfo() {
//		super.characterInfo();
//		//super:부모클래스
//		System.out.println("# 분노 : "+rage);
//	}

	@Override //기능에 있는 주석 alt+shift+s -> override / implement method
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노 : "+rage);
	}
	
	
	Warrior(){
		super(); // 부모의 생성자를 호출하는 행위, (보이지 않게 숨어있음)
	}
	
	Warrior(String name){
		super(name);
		
	}
	Warrior(String name, int hp){
		super(name,hp);
	}
	
	/*
	 메서드 재정의(Overriding)
	 - 부모클래스로부터 상속받은 메서드를 자식클래스에서
	 행위를 바꾸거나 보완하기 위해 다시 정의해서 사용하는 것
	 
	 # 규칙
	  - 반드시 상속을 전제로 해야함
	  - 반드시 반환 유형이 같아야 함
	  - 메서드 이름이 같아야 함
	  - 매개 변수 선언이 정확히 일치해야 합니다.
	  - 접근제한자는 같거나 더 제한이 없어야 합니다.(more public)
	 */
	
}
