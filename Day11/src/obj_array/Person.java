package obj_array;

//다형성 관련 내용
public class Person {
	private String name;
	private int age;
	private String gender;

	public Person() {
		// TODO Auto-generated constructor stub
	}// 단축키 ctrl+space > enter

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	} // 단축키 alt+shift+s > Generate Constructor using Fields 선택

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	void personinfo() {
		System.out.printf("이름: %s\n나이: %d세\n성별: %s\n", this.name, this.age, this.gender);
		System.out.println("-----------------");
	}

}
