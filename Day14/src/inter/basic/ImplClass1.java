package inter.basic;

public class ImplClass1 implements Inter1,Inter2{

	

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Inter1의 추상메서드 구현!");
		
	}
	
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Inter2의 추상메서드 구현!");
		
		
	}

	@Override
	public void method3() {
		System.out.println("부모 인터페이스의 추상메서드 구현");
		// TODO Auto-generated method stub
		
	}


	/*
	 1. 인터페이스를 작성한 후에는 클래스를 생성해서
	 인터페이스에 명세된 내용을 구현하시면 됩니다.
	 
	 2. 인터페이스의 구현 키워드는 implements 입니다.
	 상속과 같이 클래스 이름 뒤에 구현할 인터페이스 이름을 작성합니다.
	 
	 3. 인터페이스에 선언된 추상 메서드는 반드시 구현 클래스에서
	 오버라이딩을 진행해야 합니다.
	 
	 4. 인터페이스는 하나의 클래스에서 여러개의 인터페이스를
	 동시에 다중구현할 수 있습니다.
	 
	 5. 인터페이스들끼리는 서로 상속할 수 있습니다.
	 
	 */
}
