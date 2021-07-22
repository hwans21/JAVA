package inherit.good;

public class Hunter extends Player{

	String pet;

	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("# 펫 : "+pet);
	}
	
}
