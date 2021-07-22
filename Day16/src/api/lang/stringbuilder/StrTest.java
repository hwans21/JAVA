package api.lang.stringbuilder;

public class StrTest {

	public static void main(String[] args) {
		//String 속도체크
		//StringBuffer ≒ StringBuilder
		// 멀티스레드         싱글스레드
		long start;
		long end;
		
		start = System.currentTimeMillis();
		String str = "A";
		
		for(int i = 1; i<=500000;i++) {
			str+="A";
		}
		end = System.currentTimeMillis();
		System.out.println("String 소요시간 : "+(end-start)*0.001+"초");
		
		start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("A");
		for(int i =1;i<=500000;i++) {
			sb.append("A");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder 소요시간 : "+(end-start)*0.001+"초");
		
	}
}
