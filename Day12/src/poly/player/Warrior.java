package poly.player;

public class Warrior extends Player {
	int rage;

	@Override // 기능에 있는 주석 alt+shift+s -> override / implement method
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노 : " + rage);
	}


	void rushPrint(Player p,int damage, String str) {
		p.hp -= damage;
		System.out.printf("%s님이 %s님에게 돌진을 시전했습니다.!\n", this.name, p.name);
		System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n", p.name,str, damage);
		System.out.printf("%s(%s)님의 남은 체력: %d\n",p.name,str,p.hp);
		System.out.println("--------------------");
		
	}
	public void rush(Player p) {
		int damage;
		String str;
		if (p instanceof Warrior) {
			damage = 10;
			str = "전사";
			rushPrint(p,damage,str);
		} else if (p instanceof Mage) {
			damage = 20;
			str = "마법사";
			rushPrint(p,damage,str);

		} else if (p instanceof Hunter) {
			damage = 15;
			str = "사냥꾼";
			rushPrint(p,damage, str);
		} else
			return;

	}
	/*
	 * 1. rush라는 기술을 사용하는 사람의 이름을 적절한 키워드를 사용하여 출력해 주세요
	 * 
	 * 2. 이 기술을 맞는 사람의 피해량을 출력해 주세요. 
	 * 전사는 10의 피해, 마법사는 20의 피해, 사냥꾼은 15의 피해를 각각 입습니다.
	 * 
	 * 3. 직업별로 다른 피해량을 instanceof 키워드를 사용하여 구분해서 출력해 주세요
	 * 
	 * 4. 남은 체력들도 마찬가지로 출력해 주세요
	 * 
	 * 
	 * 출력예시 
	 * 전사1님이 전사2님에게 돌진을 시전했습니다! 
	 * 전사2(전사)님이 10의 피해를 입었습니다. 
	 * 전사2님의 남은 체력: 25
	 */

	Warrior() {
		super(); // 부모의 생성자를 호출하는 행위, (보이지 않게 숨어있음)
	}

	Warrior(String name) {
		super(name);

	}

	Warrior(String name, int hp) {
		super(name, hp);
	}
}
