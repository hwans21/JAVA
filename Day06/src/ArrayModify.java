import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {

		String[] foods = {"삼겹살","족발","피자","햄버거"};
		System.out.println(Arrays.toString(foods));
		
		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));
		
		System.out.println("-====================");
		
		//배열의 인덱스 탐색
		Scanner sc = new Scanner(System.in);
		System.out.println("탐색할 음식을 입력하세요: ");
		String name = sc.next();
		int i;
		//boolean flag = false;
		for(i=0; i<foods.length; i++)
		{
			if(foods[i].equals(name)) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스: "+i+"번");
			//	flag = true;
				break;
			} 
//			else if(i == foods.length-1) System.out.println("읎어요"); //1번째 방법
		}
//		if(!flag) System.out.println("읎어요"); // 3번째 방법
		
//		if(i==foods.length) System.out.println("읎어요"); // 2번째 방법
		// 3번째 방법 불린타입
		// 4번째 방법 카운트 
		sc.close();
		 
	}
	

}
