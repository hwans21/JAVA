package thread.ex05_join;

public class TestA implements Runnable{

	private int sum;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=100;i++) {
			sum+=i;
			System.out.println("A누적합: "+sum);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public int getSum() {
		return sum;
	}
}
