
public class Bread {

	int price;
	String name;
	String ingredient;
	
	Bread(){}
	/*
	 * 인수를 받는 생성자를 생성할 때, JVM이 기본생성자를 생성하지 않는다
	 * 따라서 기본생성자를 써두어야 한다. 
	 */
	
	Bread(int pPrice, String pName, String pIngredient){
		price = pPrice;
		name = pName;
		ingredient = pIngredient;
	}
	void info() {
		System.out.println("빵 이름: "+name);
		System.out.println("빵 가격: "+price);
		System.out.println("주 재료: "+ingredient);
	}
}
