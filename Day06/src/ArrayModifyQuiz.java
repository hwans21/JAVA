import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] kakao= {"무지","네오","어피치","라이언","제이지"};
		System.out.println("현재 저장된 친구들 : "+Arrays.toString(kakao));
		System.out.print("수정할 친구를 입력하세요 : ");
		String name = sc.next();
		/*
		 1. 사용자에게 수정할 친구를 입력받아서
		 입쳘한 친구가 배열에 존재한다면
		 수정할 값을 다시 입력받으세요.
		 
		 2. 이름을 수정한 후 "수정 후 결과: ~~~~~"를 출력하세요.
		 
		 3. 사용자가 입력한 이름이 배열에 없다면 "'xxx'은 없는 이릅입니다"
		 를 출력하세요
		 */
		
//		int i;
//		
//		for(i=0;i<kakao.length;i++) {
//			if(name.equals(kakao[i]))break;
//			
//		}
//		if (i!=kakao.length) {
//			System.out.print("변경할 이름을 입력하세요 :");
//			name = sc.next();
//			kakao[i] = name;
//			System.out.println("수정 후 결과 : "+Arrays.toString(kakao));
//			
//		} else {
//			System.out.println("\'"+name+"\'은 없는 이름입니다.");
//		}
//		----------------------------------------------------
		boolean flag = false;
		for(int i=0;i<kakao.length;i++) {
			if(name.equals(kakao[i])) {
				System.out.println(name+"의 이름을 수정합니다.");
				System.out.print("> ");
				kakao[i] = sc.next();
				System.out.println("수정 후 결과 : "+Arrays.toString(kakao));
				flag = true;
				break;
			}
		}
		if (!flag) 
			System.out.println("\'"+name+"\'은 없는 이름입니다.");
			
		sc.close();
	}
}
