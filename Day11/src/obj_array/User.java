package obj_array;

public class User {

	/*
	 * 문제1
	 * 1. 클래스 User를 생성하세요
	 * 2. 멤버변수 id: String, pw:int  age: int 를 선언 후 은닉 처리합니다.(private)
	 * 3. User 클래스에는 기본생성자, 모든 멤버변수를 초기화 하는 생성자 2개를 생성하세요.
	 * 4. MainClass에는 User객체를 생성 후 (홍길동, 123123,20)을 저장하고 값을 확인하세요
	 * 
	 * 문제 2
	 * 1. 2개의 크기를 갖는 User배열을 선언하세요 (User배열은 User클래스를 저장할 수 있습니다.)
	 * 2. 두번째 User객체를 생성하세요("김길동", 456456,30)을 저장
	 * 3. User배열에 두 객체를 저장하세요
	 * 4. 향상for문을 사용해서 *모든 변수*를 출력하세요
	 * ex> User[] arr = new User[2];
	 * 
	 *  문제 3
	 *  1. 5개의 크기를 갖는 User배열을 선언하세요
	 *  2. 5번회전하는 While안에서 Scanner객체를 이용하여 id,pw,age을 입력받으세요
	 *  3. while문 안에서 User객체를 생성하고, 입력받은 id,pw,age을 저장하세요
	 *  4. while문 안에서 User객체를 User배열에 저장하세요
	 *  5. Arrarys.toString(배열명)을 이용하여 저장되는 값을 확인하세요
	 */
	
	private String id;
	private int pw;
	private int age;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	

	public User(String id, int pw, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	void userInfo() {
		System.out.printf("ID:%s\nPW:%d\nage:%d\n--------------------\n",
				this.id,this.pw,this.age);
	}


	public String getId() {
		return id;
	}


	public int getPw() {
		return pw;
	}


	public int getAge() {
		return age;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setPw(int pw) {
		this.pw = pw;
	}


	public void setAge(int age) {
		this.age = age;
	}
	

	
	
}
