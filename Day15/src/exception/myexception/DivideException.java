package exception.myexception;

public class DivideException extends Exception {

	/*
	  serialVersionUID를 지정하지 않으면 컴파일 과정에서
	  컴파일러가 계산한 임의의 값을 부여합니다. 그렇다면
	  컴파일러가 어떤 것이냐에 따라 부여되는 값이 다를 수가 있는데,
	  처리된 예외를 로그를 출력해서 확인할 때, 서로 다른 예외 종류라고
	  인식할 수도 있어서 고유한 상수를 매겨서 판단하게 합니다.
	  
	  
	 */
	private static final long serialVersionUID = 1L; //직렬화?시리얼뭐시기

	public DivideException() {

	}
	
	public DivideException(String message) {

		super(message);
	}
	

}
