package generic.basic03;

public class Course<T> {

	private String num;
	private T student;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public T getStudent() {
		return student;
	}
	public void setStudent(T student) {
		this.student = student;
	}
	
}
