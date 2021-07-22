package inter.quiz;

public class MelonMusic implements SongList {

	private String[] list = new String[100]; // 노래목록
	private int count =0; // 노래의 개수
	
	/*
	 - SongList인터페이스를 구현하여 기능을 작성합니다.
	 - insertList()는 list배열에 노래를 순서대로 저장
	 - playList()는 list의 음악을 랜덤하게 출력
	 - playLength()는 저장된 음악의 개수를 반환
	 */
	@Override
	public void insertList(String song) {
		this.list[this.count] = song;
		this.count++;

	}

	@Override
	public void playList() {
		// TODO Auto-generated method stub
		for(int i=0; i<count;i++) {
			int rn = (int)(Math.random()*count);
			System.out.println(list[rn]);
		}
//		int rannum = (int)(Math.random()*(this.count));
//		System.out.println("현재 곡 :"+this.list[rannum]);

		
	}

	@Override
	public int playLength() {
		// TODO Auto-generated method stub
		return this.count;
	}

}
