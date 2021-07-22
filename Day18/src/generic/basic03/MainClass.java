package generic.basic03;

public class MainClass {

	public static void main(String[] args) {
		Course<Student> course = new Course<>();
		
		course.setNum("1");
		course.setStudent(new Student("김철수",20));
		
		///////////////////////////////////////////
		
		Academy a = new Academy();
		a.info(course);
		
		Course<Student> s = a.get();
	}
}
