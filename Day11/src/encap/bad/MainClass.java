package encap.bad;

public class MainClass {
	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		my.year = 1995;
		my.month= 1;
		my.day = 30;
		my.birthInfo();
		
		my.year = 13131995;
		my.month= 1414141;
		my.day = 13131330;
		my.birthInfo();
		
		/*
		 * 변수에 직접 접근 할 수 있어 쓰레기 값을 걸러내지 못함
		 */
	}
}
