package api.lang.system;

public class SystemTime {

	public static void main(String[] args) {
		/*
		 System 메서드들은 static으로 선언되어있기 때문에
		 객체를 따로 생성할 필요가 없다
		 
		 System 클래스가 제공하는 currentTimeMillis()는
		 1970년 1월 1일 자정을 기준으로 현재까지 소요된 시간을
		 밀리초(1/1000) 또는 nanoTime()은 나노초(1/10^9)
		 로 변환한 long타입의 정수를 반환합니다.
		 */
		
//		long time = System.currentTimeMillis();
//		System.out.println(time);
		
		
		long start = System.currentTimeMillis();
		
		
		long total = 0;
		for(int i =0; i<1000000000L;i++) {
			total+=i;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("실행 소요시간: "+(end-start)*0.001+"초");
		System.out.println(System.getProperties());
	}
}
