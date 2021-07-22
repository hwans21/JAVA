package thread.ex03_syncro;

public class MainClass {

	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		
		Thread t1 = new Thread(threadTest, "A");
		Thread t2 = new Thread(threadTest, "B");
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		

	}

}






