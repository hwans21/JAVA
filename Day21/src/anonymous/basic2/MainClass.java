package anonymous.basic2;

public class MainClass {

	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.getRemote().turnOn();
		tv.getRemote().volumeUp();
		tv.getRemote().volumeDown();
		tv.getRemote().turnOff();
		
		Radio radio = new Radio();
		radio.getRemote().turnOn();
		radio.getRemote().volumeUp();
		radio.getRemote().volumeDown();
		radio.getRemote().turnOff();
		
		
	}
}
