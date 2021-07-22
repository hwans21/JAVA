package poly.param;

public class Driver {
	
	
	
	public Car buyCar(String name) {
		if(name.equals("소나타")) {
			System.out.println("소나타를 구입합니다.");
			return new Sonata();
		} else if(name.equals("모닝")) {
			System.out.println("모닝을 구입합니다.");
			return new Morning();
		} else if(name.equals("테슬라")) {
			System.out.println("테슬라를 구입합니다.");
			return new Tesla();
		} else
			return null;
		
	}
	public void drive(Car s) {
		System.out.println("운전을 시작합니다.");
		s.run();
	}
}
