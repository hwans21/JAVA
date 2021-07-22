package inherit.quiz;

public class Employee extends Person{

	String departments;

	@Override
	String info() {
		// TODO Auto-generated method stub
//		String str = super.info();
//		str += ", 담당부서 : "+departments;
//		return str;
		
		return super.info()+ ", 담당부서 : "+departments;
	}
	
}
