package this_super;

public class Hunter extends Player{

	String pet;

	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("# 펫 : "+pet);
	}
	
	Hunter(String name){
		super(name);
		
	}
	Hunter(String name, int hp){
		super(name,hp);
	}
}
