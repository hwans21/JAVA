package poly.quiz;

public class MainClass {

	public static void main(String[] args) {
		/*
		 MyCart 객체 생성 후 처음 지급되는 돈은 5000원으로 하겠습니다.
		 buy메서드를 호출하기 전에 tv, radio, computer객체를 
		 하나씩 생성해 주세요.
		 
		 상품을 buy메서드로 구입해서 MyCart 객체가 정상적으로 
		 동작하는지를 확인하세요
		 */
		MyCart cart = new MyCart(50000);
		
		
		Product tv = new Tv();
		Product radio = new Radio();
		Product com = new Computer();
		
			
		tv = (Tv)tv;
		radio = (Radio)radio;
		com = (Computer)com;

		
		cart.buy(tv);
		cart.buy(tv);
		cart.buy(tv);
		cart.buy(tv);
		cart.buy(tv);
		cart.buy(radio);
		cart.buy(radio);
		cart.buy(radio);
		cart.buy(radio);
		cart.buy(radio);
		cart.buy(com);
		cart.buy(com);
		cart.buy(com);
		cart.buy(com);
		cart.buy(com);
		
		cart.info();
	}
}
