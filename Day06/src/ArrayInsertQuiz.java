import java.util.Scanner;
public class ArrayInsertQuiz {

	public static void main(String[] args) {
		/*
		 * 1. String 배열을 생성하세요. (foods)
		 * 크기는 넉넉하게 50개로 지정하겠습니다.
		 * 
		 * 2. 사용자에게 음식이름을 입력받아서 배열에 
		 * 삽입해 주세요
		 * 사용자가 음식입력창에 '배불러' 라고 작성하면
		 * 입력을 종료해 주세요./
		 * 
		 * 3. 입력이 종료되면 사용자가 입력한 음식을
		 * 가로로 출력해 주세요. (null은 출력하지 마세요)
		 * ----추가문제-----
		 * - 입력받아서 이미 배열에 존재하는 음식이라면 
		 * '이미 존재하는 음식입니다' 출력하시고
		 * 다시 음식을 입력받을 수 있도록 코드를 제어해 보세요.
		*/
		Scanner sc = new Scanner(System.in);
		boolean f = false;
		String[] foods = new String[50];
		
		for(int i=0;i<foods.length;i++) {
			System.out.print("음식을 입력해주세요 : ");
			String food = sc.next();
			
			if(food.equals("배불러"))break;
			
			for(int j=0; j < i;j++) {
				if(foods[j].equals(food)) {
					f = true;
					break;
				}
			} if(f) {
				i--;
				System.out.println("이미 존재하는 음식입니다."); 
				f=false;
				continue;
			}
			
			foods[i] = food;
		}
		
		
		System.out.println("------------------");
		System.out.print("내가 먹고 싶은 음식들 : [");
		for(String food : foods) {
			if(food == null)break;
			System.out.print(food + " ");
		}
		System.out.println("]");

	}

}
