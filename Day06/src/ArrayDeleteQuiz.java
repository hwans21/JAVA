import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] kakao= {"무지","네오","어피치","라이언","제이지"};
		System.out.println("현재 저장된 친구들 : "+Arrays.toString(kakao));
		
		/*
		 1. 삭제할 친구를 입력받아서 삭제를 진행하세요.
		 
		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.
		 */
//		boolean flag = false;
//		while(true) {
//			System.out.print("삭제할 친구를 입력하세요 : ");
//			String name = sc.next();
//			for(int i=0; i<kakao.length; i++) {
//				if(name.equals(kakao[i])) {
//					String[] temp = new String[kakao.length-1];
//					for(int j=i; j<kakao.length-1;j++)
//						kakao[j] = kakao[j+1];
//					
//					for(int j=0;j<temp.length;j++)
//						temp[j] = kakao[j];
//					kakao = temp;
//					temp = null;
//					flag = true;
//					break;
//				}
//			}
//			if(!flag) System.out.println("존재하지 않는 이름입니다.");
//			else {
//				System.out.println(Arrays.toString(kakao));
//				break;
//			}
//		}
		System.out.print("삭제할 친구를 입력하세요 : ");
		String name = sc.next();
		int i;
		for(i=0; i<kakao.length;i++) {
			if(name.equals(kakao[i])) {
				for(int j=i;j<kakao.length-1;j++) {
					kakao[j] = kakao[j+1];
				}
				break;
			}
			
		}
		
		if(i == kakao.length)
			System.out.println("존재하지 않는 이름입니다.");
		else {
			String[] temp = new String[kakao.length -1];
			for(int k=0;k<temp.length;k++) {
				temp[k] = kakao[k];
			}
			kakao = temp;
			temp=null;
			System.out.println("삭제 후 정보 : "+Arrays.toString(kakao));
		}
		sc.close();
		

	}	
}