package anonymous.basic2;

public class Radio {

	private int sound;
	private RemoteController remote;
	public Radio() {
		remote = new RemoteController() {
			
			@Override
			public void volumeUp() {
				sound++;
				System.out.println("라디오의 볼륨: "+sound);
				
			}
			
			@Override
			public void volumeDown() {
				// TODO Auto-generated method stub
				sound--;
				System.out.println("라디오의 볼륨: "+sound);
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("라디오를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("라디오를 끕니다.");
				
			}
		};
	}
	
	public RemoteController getRemote() {
		return remote;
	}
	public void setRemote(RemoteController remote) {
		this.remote = remote;
	}
	
}
