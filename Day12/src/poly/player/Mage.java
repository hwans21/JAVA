package poly.player;

public class Mage extends Player {

	int mana;

	Mage() {
		super();
	}

	Mage(String name) {
		super(name);
		this.mana = 100;

	}

	Mage(String name, int hp) {
		super(name, hp);
		this.mana = 100;
	}

	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("# 마나 : " + mana);
	}

	public void blizzard(Player[] players) {
		System.out.printf("%s님이 눈보라 시전!!", this.name);
		System.out.println("----------------------");
//		int damage = 0;
//		for (int i = 0; i < players.length; i++) {
//			damage = (int) ((Math.random()*6) + 10);
//			players[i].hp -= damage;
//			System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %s)\n", players[i].name, damage, players[i].hp);
//		}
		for(Player p : players) {
			int damage = (int) ((Math.random()*6) + 10);
			p.hp -= damage;
			System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %s)\n", p.name, damage, p.hp);
		}

	}

}
