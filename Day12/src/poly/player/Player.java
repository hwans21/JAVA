package poly.player;


public class Player {

	String name;
	int level;
	int atk;
	int hp;
	
	Player(){
		System.out.println("Player의 기본 생성자 호출!");
		level =1;
		atk =3;
		hp=50;
		
	}
	
	Player(String name){
		this(); 
		System.out.println("Player의 2번 생성자 호출!");
		this.name = name;
		
	}
	
	Player(String name, int hp){
		this(name);
		System.out.println("Player의 3번 생성자 호출!");
		this.hp = hp;
		
	}
	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디 : "+name);
		System.out.println("# 레벨 : "+level);
		System.out.println("# 공격력: "+atk);
		System.out.println("# 체력 : "+hp);
	}
}
