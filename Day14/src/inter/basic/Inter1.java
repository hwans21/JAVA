package inter.basic;

public interface Inter1 extends Inter {

	//인터페이스 내에 변수를 선언하면 자동으로 상수로 취급합니다.
	double PI = 3.14;// (static final) double PI = 3.14;
	
	//인터페이스 내에 메서드를 선언하면 자동으로 추상메서드가 됩니다..
	public void method1(); // public (abstract) void method1();


	
//	Inter1() {
//		
//	} // 인터페이스는 생성자를 가질 수 없습니다.
	// 즉 객체를 생성할 수 없습니다.
	
	
	
	
}
