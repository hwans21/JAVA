package poly.player;

public class MainClass {
	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사1");
		Warrior w2 = new Warrior("전사2");
		
		Mage m1 = new Mage("마법사1");
		Mage m2 = new Mage("마법사2");
		
		Hunter h1 = new Hunter("사냥꾼1");
		Hunter h2 = new Hunter("사냥꾼2");
		
		Player[] p = {w1,w2,m2,h1,h2};
		m1.blizzard(p);
		/*
		 1. Mage는 blizzard라는 광역기술(메서드)을 가지고 있습니다.
		 
		 2. Mage클래스의 blizzard라는 메서드를 완성하세요
		 
		 3. 메서드 호출부의 들어갈 매개값으로 알맞은 매개값을 선언하세요
		 광역마법이기 때문에 타겟이 여러명 이어야 합니다.
		 단, 매개변수는 하나입니다.
		 
		 4. blizzard라는 기술을 시전하는 캐릭터의 이름을 적절한 키워드를
		 사용하여 출력해보세요
		 
		 5. 피해량(데미지)은 10~15사이의 난수를 발생시켜서
		 타겟들에게 각각 적용시켜주세요
		 
		 6. 기본 객체의 hp는 50입니다. hp에서 피해량을 뺀 남은 체력을
		 출력해주세요.
		 
		 출력예시
		 마법사1님이 눈보라 시전!!
		 ---------------------
		 전사1님 ?? 피해를 입었습니다. (남은체력: ??)
		 전사2님 ?? 피해를 입었습니다. (남은체력: ??)
		 마법사2님 ?? 피해를 입었습니다. (남은체력: ??)
		 사냥꾼1님 ?? 피해를 입었습니다. (남은체력: ??)
		 사냥꾼2님 ?? 피해를 입었습니다. (남은체력: ??)
		 
		 5객체를 한꺼번에 블리자드 메소드에 보내야 함
	
		 */
		w1.rush(w2);
		w1.rush(h2);
		w1.rush(m2);
	}
}
