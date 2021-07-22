package encap.good;

public class MyBirth {

	/*
	 * # 은닉(캡슐화) : 데이터 보호의 목적으로 사용하는 OOP기술 중 하나.
	 * 
	 * - 은닉할 멤버변수에 private 접근제한을 붙임
	 * 
	 * 
	 */

	private int year;
	private int month;
	private int day;


	
	/*
	 * - 은닉은 데이터의 접근 제한을 걸어서 정보를 보호하는 것이 목적이지만, private을 설정하면 데이터 접근 자체가 불가능해집니다.
	 * 
	 * - 따라서 데이터의 유효성을 검증할 수 있는 제어문이 포함된 메서드를 사용하여 데이터의 접근을 허용하도록 설계하는데, 이 때 사용하는
	 * 메서드를 getter / setter 메서드라고 부릅니다.
	 * 
	 * # setter method
	 * 
	 * 1. setter는 은닉된 변수에 값을 저장하기 위한 메서드 입니다.
	 * 
	 * 2. 메서드 내부에 데이터 유효성 검증 로직을 작서앟여 적절한 데이터만 멤버변수에 저장시키고, 접근제한자는 public으로 설정하여
	 * 외부에서 누ㅜ나 사용할 수 있게 합니다.
	 * 
	 * 3. 메서드 이름은 일반적으로 set + 멤버변수이름으로 지정합니다.(관례)
	 * 
	 */

	public void setyear(int year) {
		if (year < 1900 || year > 2021) {
			System.out.println("잘못된 연도 입력입니다.");
			this.year = 0;
		} else
			this.year = year;
	}

	public void setmonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("잘못된 월 입력입니다.");
			this.month = 0;
		} else {
			this.month = month;

		}

	}

	public void setday(int day) {
		if (day < 1 || day > 31) {
			System.out.println("잘못된 일 입력입니다.");
			this.day = 0;
		} else {
			this.day = day;

		}

	}

	/*
	 * # getter method
	 * 
	 * 1. getter는 은닉된 변수의 값을 참조할 때 사용하는 메서드 입니다.
	 * 
	 * 2. setter와 마찬가지로 public 제한을 통해 외부에 메서드를 공개하고, 이름은 일반적으로 get + 멤버변수 이름으로
	 * 지정합니다.
	 */

	public int getyear(String pw) {
		if(pw.equals("abcd1234"))
			return this.year;
		else
			System.out.println("비밀번호가 틀렸습니다.");
		return 0;
	}
	//get메서드에는 보통 비밀번호를 사용하지 않지만 사용하고 싶다면 위와 같은 방법도 가능하다

	public int getmonth() {
		return this.month;
	}

	public int getday() {
		return this.day;
	}

	
//	문지기 메서드를 사용해 해당 메서드를 사용가능 불가능 판단을 할 수 있음
}
