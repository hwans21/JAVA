package exception.myexception;

public class MainClass {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperand(20, 0);;
		try {
			c.divide();
		} catch (DivideException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
