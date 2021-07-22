package generic.basic03;

public class Academy {

	// 제네릭 클래스를 매개 변수로
	public void info(Course<Student> c) {
		String num = c.getNum();
		Student student = c.getStudent();

		System.out.println("번호: " + num + ",이름: " + student.getName() + ",나이: " + student.getAge());
	}
	
	// 제네릭 클래스를 반환유형으로 
	
	public Course<Student> get(){
		Course<Student> c = new Course<>();
		c.setNum("2");
		c.setStudent(new Student("홍길동",30));
		return c;
		
	}
}
