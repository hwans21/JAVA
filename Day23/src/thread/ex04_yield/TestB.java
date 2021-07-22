package thread.ex04_yield;

public class TestB implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("B스레드가 실행중!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
