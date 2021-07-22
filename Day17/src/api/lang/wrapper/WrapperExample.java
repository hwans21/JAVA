package api.lang.wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		int a = 100;
		boolean b = false;
		char c = 'a';
		double d = 3.14;

		// boxing: 기본타입을 객체타입으로 변환하는 과정 (권장 x 1.8까지는 사용이 되지만 11이후부터는 사용이 안됨)
		Integer v1 = new Integer(a);
		Boolean v2 = new Boolean(b);
		Character v3 = new Character(c);
		Double v4 = new Double(d);

		Object[] arr = { v1, v2, v3, v4 };

		// unboxing: 포장된 객체를 다시 기본타입으로 변환하는 작업
		a = v1.intValue();
		b = v2.booleanValue();
		c = v3.charValue();
		d = v4.doubleValue();

		// 귀찮음
		// 1.8버전부터 autoboxing을 지원함
		// autoboxing: 기본타입을 자동으로 객체형으로 변환

		Integer x1 = a;
		Boolean x2 = b;
		Character x3 = c;
		Double x4 = d;

		// AutoUnboxing도 마찬가지로 간편하게 객체 포장을 기본형으로 해제 가능

		int i = x1;
		boolean o = x2;
		char p = x3;
		double j = x4;
		
		// AutoBoxing 이후에 wrapper클래스는 문자열을 기본형으로 
		// 변환하는 데 많이 사용됩니다.
		
		String s1 = "10";
		String s2 = "3.14";
		
		System.out.println(s1+s2);

		
		// 문자로 이루어진 정수를 실제 정수로 변환하는 메서드
		int num1 = Integer.parseInt(s1);
		
		// 문자로 이루어진 실수를 실제 실수로 변환하는 메서드
		double num2 = Double.parseDouble(s2);
		
		
		// 해당 타입으로 변환할 수 없는 문자열을 시도했을 때는
		// NumberFormatException 예외가 발생합니다.
		System.out.println(num1+num2);

	}
}
