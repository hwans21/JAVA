package inherit.quiz;

public class Teacher extends Person{

	String subject;

	@Override
	String info() {
		// TODO Auto-generated method stub
//		String str = super.info();
//		str += ", 담당과목 : "+subject;
//		return str;
		return super.info()+", 담당과목 : "+subject;
	}
	
}
