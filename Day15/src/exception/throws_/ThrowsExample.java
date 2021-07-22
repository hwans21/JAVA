package exception.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	
	static String[] greetings = {"안녕","헬로","니하오"};

	
	/*
	 # throws
	 
	 - throws는 예외의 원인이 메서드 선언부가 아니라 호출부에 있을 경우
	 예외 처리를 메서드의 호출부로 떠넘기는 방식입니다.
	 
	 - throws는 생성자에도 선언이 가능하며, 메서드나 생성자를 호출 시 
	 예외처리를 강요하고 싶을 때 사용합니다.
	 
	 1. 경고(반드시 예외처리 할 것)
	 2. 예외를 몰아주는 역할
	 
	 
	 */
	static void greet(int idx) throws Exception {
		System.out.println(greetings[idx]);		
	}

	public static void main(String[] args) { // 메인메소드에 throws를 쓰게되면 자바가상머신이 던진다.
												// 단 자바가상머신은 예외처리를 할줄 모르기 때문에 터진다.
		try {
			greet(3);
		} catch (Exception e) {
			System.out.println("인덱스 범위가 벗어났다.");
			e.printStackTrace();
			// printStackTrace()메서드는 예외 발생 원인을 역추정하여
			// 예외가 어디서 발생했는지, 그 이유는 무엇인지를
			// 메시지를 통해 개발자에게 전달하므로 자주 사용하는 메서드입니다.
		}
		// 대표적인 throws 메서드
		// 클래스 객체를 강제로 구동시킬 수 있는 메서드.
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		// 대표적인 throws 생성자
		
		try {
			new FileInputStream("@#$@#^#");
		
		//	FileInputStream fs = new FileInputStream("test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
