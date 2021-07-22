package inter.quiz;

public class GenieMusic implements SongList {

	private String[] list = new String[100];
	private int count = 0;
	/*
	 - SongList인터페이스를 구현해 주세요.
	 - 기능은 마음대로 작성
	 
	 */
	@Override
	public void insertList(String song) {
		// TODO Auto-generated method stub
		this.list[this.count] = song;
		this.count++;

	}

	@Override
	public void playList() {
		// TODO Auto-generated method stub
		for(int i=0; i<count;i++) {
			System.out.println(list[i]);
		}
//		System.out.println("현재 곡 :"+this.list[(int)(Math.random()*(this.count))]);
		
	}

	@Override
	public int playLength() {
		// TODO Auto-generated method stub
		return this.count;
	}

}
