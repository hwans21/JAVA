package this_super;

public class MainClass {

	public static void main(String[] args) {
		Player p1 = new Player();
		System.out.println("p1의 주소값: "+p1);
		p1.characterInfo();
		System.out.println("----------------");
		
		Player p2 = new Player("플레이어2"); 
		System.out.println("p2의 주소값: "+p2);
		
		p2.characterInfo();
		
		Player p3 = new Player("플레이어3", 1000000);
		p3.characterInfo();
		
		System.out.println("---------------------");
		
		
		Warrior w1 = new Warrior();
		w1.characterInfo();
		
		System.out.println("---------------------");
		
		Mage m1 = new Mage("대법관", 80);
		Mage m2 = new Mage("대마도사", 9990);
		
		m1.characterInfo();
		m2.characterInfo();
		
		
	}
}
