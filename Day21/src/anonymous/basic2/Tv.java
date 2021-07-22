package anonymous.basic2;

public class Tv {

	private int volume;
	private RemoteController remote;
	
	public Tv() {
		remote = new RemoteController() {
			
			@Override
			public void volumeUp() {
				volume++;
				System.out.println("Tv의 볼륨 : "+volume);
				
			}
			
			@Override
			public void volumeDown() {
				// TODO Auto-generated method stub
				volume--;
				System.out.println("Tv의 볼륨 : "+volume);
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("Tv를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("Tv를 끕니다.");
				
			}
		};//  익명객체의 끝.
	}
	
	public RemoteController getRemote() {
		return remote;
	}
	public void setRemote(RemoteController remote) {
		this.remote = remote;
	}
}
