package lambda.basic;

interface Calculator {
	int add(int n1, int n2);
}

public class MainClass {

	public static void main(String[] args) {
		Person p = new Person();

		p.greeting(new Say01() {

			@Override
			public void talking() {
				System.out.println("안녕하세요");

			}
		});

		p.greeting(new Say02() {

			@Override
			public String talking() {
				System.out.println("Hello");

				return "Hello";
			}
		});
		p.greeting(new Say03() {

			@Override
			public String talking(String greet) {
				System.out.println(greet);
				return greet;
			}
		});

		System.out.println("---------------------------------------------------");
		// 익명객체 Say01이 구현해야 할 추상메서드를 람다식으로 표현

		// greeting메서드의 매개변수의 타입 Say01 인터페이스에는

		// 추상메서드가 단 하나기 때문에 이름을 명시하지 않아도
		// 추상메서드가 단 하나기 때문에 이름을 명시하지 않아도
		// 해당 추상메서드가 지목됩니다.

		// ()안에는 매개변수에 전달하고 싶은 값을 주고
		// ->{} 안에는 오버라이딩하는 메서드의 실행 내용을 적습니다.
		p.greeting(() -> {
			System.out.println("안녕하세요~");
		});

		p.greeting((greet) -> { // 타입 생략이 가능
			System.out.println("Hello");
			return "hello";
		});

		// Say04 인터페이스를 매개값으로 받는 greeting()을 호출해보세요
		// 전달받은 문자열 매개변수를 전달받은 int 횟수만큼 반복한 결과를
		// 리턴하는 함수를 람다식으로 선언해 보세요.

		String str = p.greeting((greet, b) -> {
			String temp = "";
			for (int i = 0; i < b; i++)
				temp += greet;
			return temp;
		});
		System.out.println(str);

		System.out.println("----------------------------------------");

		// 계산기 인터페이스와 람다식
		Calculator calc = new Calculator() {

			@Override
			public int add(int n1, int n2) {
				// TODO Auto-generated method stub
				return n1 + n2;
			}
		};

		Calculator casio = (x, y) -> {
			return x + y;
		};

		System.out.println(calc.add(10, 15));
		System.out.println(casio.add(10, 15));

		// 만약 오버라이딩하는 추상메서드에 작성할 코드가 한 줄이라면
		// 괄호 생략이 가능합니다.

		Calculator xiao = (x, y) -> x + y;
		System.out.println(xiao.add(30, 50));
	}
}
