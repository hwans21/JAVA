package thread.ex02;

public class MainClass {

	public static void main(String[] args) {
		
		
		ThreadTest thread = new ThreadTest();
		
		thread.setName("A");
		
		thread.start();
		
		System.out.println("메인종료");
		
	}
}
