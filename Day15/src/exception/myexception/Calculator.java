package exception.myexception;

public class Calculator {

	public int left;
	public int right;
	
	public void setOperand(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() throws DivideException {
		if(this.right==0) throw new DivideException("0을 넣지 마세요");
		System.out.println(this.left/this.right);
	}
}
