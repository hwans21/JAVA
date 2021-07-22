package exception.quiz;

public class MainClass {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			System.out.println("합계 : "+calc.input());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
