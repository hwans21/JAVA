
public class PhoneMain {
	public static void main(String[] args) {

		Phone basic = new Phone();
		
		basic.showSpec();
		
		System.out.println("--------------------------------");
		
		Phone iPhone12 = new Phone("아이폰12");
		iPhone12.showSpec();
		System.out.println("--------------------------------");
		
		Phone galaxyS21 = new Phone("갤럭시S21", "쒸이뻐어얼건색");
		galaxyS21.showSpec();
	}
}
