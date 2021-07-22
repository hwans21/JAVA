package inherit.quiz;

public class Student extends Person{
	String studentId;

	@Override
	String info() {
		// TODO Auto-generated method stub
//		String str = super.info();
//		str += ", 학번 : "+studentId;
//		return str;
		
		return super.info()+", 학번 : "+studentId;
	}
	
	
}
