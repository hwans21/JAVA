package anonymous.basic;

public class MainClass {

	public static void main(String[] args) {
		
		
		Car s1 = new Sonata();
		s1.run();

		// 익명객체 여러번 사용 // 
		Car tesla = new Car() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("테슬라는 소리없이 달립니다.~");
			}
		};
		tesla.run();

		// 익명객체 딱 한번 사용 // 
		new Car() {
			@Override
			public void run() {
				System.out.println("포르쉐는 팍팍 달립니다~");
				
				
			}
		}.run();
		
	}

}
