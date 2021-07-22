package modi.member.pac2;

import modi.member.pac1.A;

public class C {
	
	public C() {
		A a = new A();
		a.x =1 ;
//		a.y =2 ; (x) p.f
//		a.z =3 ; (x) private
		
		a.method1();
//		a.method2(); (x) p.f
//		a.method3(); (x) private
	}
	
}
