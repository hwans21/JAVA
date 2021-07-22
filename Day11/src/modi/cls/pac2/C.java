package modi.cls.pac2;

import modi.cls.pac1.*;



public class C {

//		A a = new A(); (X) p.f -> 같은 패키지 내에서만 접근을 허용
		B b = new B(); // public
}

/*
 * class 에는 protected 와 private는 의미가 없기때문에 사용x
 */
