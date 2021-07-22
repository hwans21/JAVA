package poly.car;

public class MainClass {

	public static void main(String[] args) {
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();

		
		Morning m1  = new Morning();
		Morning m2  = new Morning();
		Car m3  = new Morning();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
		
//		s1.run();
//		s2.run();
//		s3.run();
//		m1.run();
//		m2.run();
//		m3.run();
//		t1.run();
//		t2.run();
//		t3.run();
//		t4.run();
		
		
//		Sonata[] sonatas = {s1,s2,s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
//		Sonata[] cars = {s1,s2,s3,m1,m2,m3,t1,t2,t3,t4}; (X) 배열은 타입이 모두 같아야 함
		
		Car[] cars = {s1,s2,s3,m1,m2,m3,t1,t2,t3,t4}; // 부모관계의 배열타입을 선언후 자식객체를 집어넣음(자동형변환)
		
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("=====================");
		
		Driver kim = new Driver();
		kim.drive(s1);
		kim.drive(m2);
		kim.drive(t4);
		
		System.out.println("=====================");
		System.out.println("# 타이어 교체 작업");
		
		s1.frontLeft = new Htire();
		s1.frontRight = new Ntire();
		s1.rearLeft = new Htire();
		s1.rearRight = new Ntire();
		
		
		
	}
}
