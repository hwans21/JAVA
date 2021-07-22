package thread.ex03_syncro;

public class ThreadTest implements Runnable {

	int num = 0;
	
	@Override
	public synchronized void run() {
		for(int i=1; i<=10; i++) {

			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("----------------------");
				num++;
			}

			System.out.println("스레드명: " + Thread.currentThread().getName() + ", num: " + num);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
