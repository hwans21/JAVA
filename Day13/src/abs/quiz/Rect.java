package abs.quiz;

public class Rect extends Shape {

	private int a;
	
	public Rect(String name, int a) {
		super(name);
		this.a = a;
		
	}
	public double getArea() {
		return (double)a*a;
	}
}