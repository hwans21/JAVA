package generic.basic01;

public class Main {

	public static void main(String[] args) {
		// 제네릭을 사용하면, 객체로 생성할 때 사용할 타입을 지정할 수 있고
		// 다양한 값을 저장할 수 있도록 생성할 수 있습니다.
		
		Box<String> box = new Box<>(); //생성자의 타입은 생략 가능
		box.setT("sdf");
		String name = box.getT();
		
		
		// 제네릭에는 기본 데이터 타입이 저장될 수 없습니다.
//		Box<int> intBox = new Box<int>(); (x)
		Box<Integer> intBox = new Box<>();
		intBox.setT(123984);
		int num = intBox.getT();
		
		Box<Person> pBox = new Box<>();
		pBox.setT(new Person());
		pBox.getT();
		
	}
}
