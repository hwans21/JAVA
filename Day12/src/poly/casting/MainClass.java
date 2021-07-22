package poly.casting;

public class MainClass {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2; (x)

		p.method1();
		p.method2();
//		p.method3(); (x)

		System.out.println("-------------------------");

		Child c = new Child();
		c.n1 = 1; // 부모에게 물려받은 속성
		c.n2 = 2; // 자식 고유의 속성

		c.method1();
		c.method2();
		c.method3();

		System.out.println("-------------------------");

		// 다형성 적용(promotion)
		Parent p2 = new Child();
		p2.n1 = 1;
//		p2.n2 = 2; (x) 

		p2.method1();
		p2.method2();
//		p2.method3(); (x) 
		/*
		 * - 다형성이 적용되면 자식클래스의 본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
		 * 
		 * - 이를 해결하기 위해 강제 타입 변환을 사용합니다.(Downcasting)
		 */
		System.out.println("-------------------------");

		Child c2 = (Child) p2;

		c2.n1 = 1;
		c2.n2 = 2;

		c2.method1();
		c2.method2();
		c2.method3();

		System.out.println(c2);
		System.out.println(p2);
		// c2와 p2의 주소는 같다
		// 객체는 원래 있던걸 그대로 사용하고
		// 접근방법만 바꾼 것일 뿐이다

//		Child c3 = (Child) p; (x)
//		Child c3 = (Child) new Parent(); (x)
		/*
		 * class poly.casting.Parent cannot be cast to class poly.casting.Child
		 * (poly.casting.Parent and poly.casting.Child are in unnamed module of loader
		 * 'app')
		 */
		// 다형성이 한 번도 발생하지 않은 경우에는
		// 강제 형 변환을 사용할 수 없습니다.

	}
}
