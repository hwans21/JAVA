package poly.basic;

/*
 - 자바에서는 하나의 클래스 파일에 여러개의 클래스를 선언할 수 있습니다.
 - 단, 파일명과 동일한 클래스가 반드시 존재해야 하며,
 해당 클래스만 public으로 선언할 수 있습니다.
 */


/*
---구조---
 OBJ(최상위)
  |
  A
 / \
 B  C
 |  |
 D  E
 상속 규칙
 - 상속은 단일 상속이 원칙(다중상속X)
 - B는 A의 모든것을 알지만
   A는 B의 모든것을 알지 못한다(역전관계X)
 - B와 C는 부모가 같지만 전혀 다른 관계이다(서로 상속하거나 다형성을 진행X)
 */


/*
 다형성
 부모클래스 변수 = new 자식클래스();
 ※이것이 자바다 1편 - p326
 */

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	/*
	 - 다형성이란 자식 객체가 모든 부모의 타입을 가질 수 있다는 것을
	 의미합니다.
	 
	 - 즉, 부모 타입 변수에 자식객체의 주소값을 얼마든지 저장할 수 있다는
	 것을 의미합니다.
	 
	 
	 */
	
	A v1 = new B(); //클래스타입 B -> A타입으로 자동 형 변환(promotion)
	A v2 = new C(); //클래스타입 C -> A타입으로 자동 형 변환(promotion)
	A v3 = new D();
	A v4 = new E();
	A v5 = b;
	
	B v6 = new D();
	C v7 = new E();
	
	// 상속관계가 없다면 다형성 적용이 불가능합니다.
	// 즉, 다형성은 무조건 상속 관계 하에서만 발생합니다.
	
//	B v8 = new E(); (x)
//	C v9 = new D(); (x)
	
//	B v10 = new C(); (x)
//	D v11 = new E(); (x)
	
	
	// Object는 자바의 최상위 클래스입니다.
	// 모든 클래스는 Object를 상속받습니다.
	// Object타입의 변수에는 어떠한 객체도 들어올 수 있습니다.
	
	Object o1 = new A();
	Object o2 = new B();
	Object o3 = new C();
	Object o4 = new D();
	Object o5 = new E();
	Object o6 = new String("안녕하세요");
	Object o7 = new Basic();
	/*
	 Object타입 남용 x
	 강제타입변환에서 설명할 예정
	 */
	
	
	/*
	 예)
	 각 타입별로 배열(200개씩)을 할 때
	 다형성을 선언하지 않았을 경우 5개의 배열이 필요하지만
	 선언할 경우 1개의 배열이 필요하다
	 type을 하나로 맞출 수가 있음
	 객체를 유연하게 사용가능
	 
	 ★'객체의 규격화'를 위해 필요하다 
	 */
	
	
	/*
	 어떤 상황에서 사용할 수 있는지
	 내일 설명할 예정
	 */
	
}
