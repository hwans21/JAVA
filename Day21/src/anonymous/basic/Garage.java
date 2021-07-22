package anonymous.basic;



interface Car{
	public void run(); //추상메서드
}

class Sonata implements Car{
	// 추상메서드 오버라이딩
	public void run() {
		System.out.println("소나타가 달립니다.~");
	}
}




public class Garage {

	//public Car car= new Sonata();
	
	// 익명 객체 (원래 인터페이스로 객체를 생성하지 못함)
	public Car car = new Car() {
		public void run() {
			System.out.println("익명객체 입니다.");
		};
	};
	
	
	public Garage() {
		
		car.run();
	}
	
	
}
