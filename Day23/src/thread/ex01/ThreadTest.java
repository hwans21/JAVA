package thread.ex01;

public class ThreadTest implements Runnable {
	int num = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=10;i++) {
			
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("--------------------------");
				num++;
			}
			
			System.out.println("스레드명: " + Thread.currentThread().getName() + ", num: "+num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
