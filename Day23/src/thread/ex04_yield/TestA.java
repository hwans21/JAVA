package thread.ex04_yield;

public class TestA implements Runnable {

	public boolean work = true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(work) {
				System.out.println("A스레드가 실행중!");
				
			} else {
				Thread.yield();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
