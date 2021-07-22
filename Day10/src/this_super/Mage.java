package this_super;

public class Mage extends Player{

	int mana;

	Mage(){
		super();
	}
	Mage(String name){
		super(name);
		this.mana = 100;
		
	}
	Mage(String name, int hp){
		super(name,hp);
		this.mana = 100;
	}
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("# 마나 : "+mana);
	}
	
}
