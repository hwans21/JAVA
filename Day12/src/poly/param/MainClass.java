package poly.param;

public class MainClass {

	public static void main(String[] args) {
		Driver kim = new Driver();
//		Car c=kim.buyCar("소나타");
////		Sonata c=kim.buyCar("소나타"); (x) 리턴타입이 Car이기 때문에 자식 = 부모는 되질 않는다.
//		Sonata s = (Sonata)c;
		
		Sonata s = (Sonata) kim.buyCar("소나타");
		s.run();
		s.enterMembership();
		
		CarShop shop = new CarShop();
		
		shop.carPrice(s);
		shop.carPrice(new Morning());
		shop.carPrice(kim.buyCar("테슬라"));
		
		
	}
}
