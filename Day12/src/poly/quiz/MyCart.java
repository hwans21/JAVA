package poly.quiz;

public class MyCart {

	private int money;
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0; // cart 안에 있는 상품의 개수를 알려주는 변수
	// 객체 생성 시 money만 받아서 초기화
	public MyCart(int money) {
	
		this.money = money;
	}
	
	public void buy(Product p) {
		if(this.money<p.price) {
			System.out.println("금액부족");
			return;
		} 
		this.money -= p.price;
		add(p);
		
	}
	
	
	/*
	 - public void buy(모든 상품을 전달할 수 있는 매개변수)
	 
	 - 가진 돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족"
	 출력후 메서드 강제종료.
	 - 가진 돈이 충분하면 물건의 가격을 money에서 배고 
	 add(상품)메서드 호출
	 
	 */
	private void add(Product p) {
		if(this.i>=this.cart.length) { // 자리가 없어요
			//새로운 카트를 만들자
			Product[] temp = new Product[this.cart.length*2];
			//기존 배열에 들어있는 상품을 새로운 배열에 옮기자
			
			for(int j=0;j<this.cart.length;j++) {
				
				temp[j] = this.cart[j];
				
			}
			this.cart = temp;
			temp = null;
		}
		this.cart[i] = p;
	
		i++;
		info();
		
	}
	/*
	 - public void add(모든 상품을 받을 수 있도록 선언)
	 
	 - 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 기존의 장바구니보다 크기가 * 2 큰 배열을 생성
	 기존의 장바구니의 값을 새로운 배열에 복사.
	 새로운 장바구니의 주소값을 기존의 장바구니와 바꿉니다.
	 
	 - 매개변수로 전달된 상품을 장바구니에 담는다.
	 상품이 추가될 때 마다 i의 값을 하나씩 올린다.
	 
	 - info() 호출
	 */
	
	public void info() {
		int totalPrice = 0;
		for(int j=0;j<this.cart.length;j++) {
			if(this.cart[j] == null) break;
			System.out.print(this.cart[j].name+" ");
			totalPrice += this.cart[j].price;
		}
		System.out.println();
		System.out.printf("총 가격 : %d\n",totalPrice);
		System.out.printf("남은 금액 : %d\n", this.money);
		
	}
	/*
	 -public void info()
	 
	 - 장바구니 안에 담긴 물건의 목록(name)을 출력합니다.
	 - 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 - 남은 금액 출력
	 
	 - MyCart선언이 완료되었다면 MainClass에서 buy메서드 호출
	 
	 */
}
