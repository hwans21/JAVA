
public class Person {

	String name;
	int age;
	int tall;

	Person() {
	}

	Person(String pname, int page, int ptall) {
		name = pname;
		age = page;
		tall = ptall;
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키:" + tall + "cm");
	}
}
