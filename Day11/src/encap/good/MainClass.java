package encap.good;

public class MainClass {
	public static void main(String[] args) {
		MyBirth my = new MyBirth();
//		my.year = 1995;
//		my.month = 1;
//		my.day = 30;
//		(x) private로 수정했기 때문에 직접 수정 불가능함	
//		나중에 문제가 생겼을 때 어디서 발생했는지 찾기가 힘듬

		my.setyear(1995);
		my.setmonth(1);
		my.setday(31);

		System.out.printf("제 생일은 %d년 %d월 %d일 입니다. \n", 
				my.getyear("abcd1234"), my.getmonth(), my.getday());
		my.setyear(31);
		my.setmonth(1123);
		my.setday(-1);
		
		System.out.printf("제 생일은 %d년 %d월 %d일 입니다. \n", 
				my.getyear("abcd1234"), my.getmonth(), my.getday());

		
	}
}
