package inter.good;

import java.util.Scanner;

public class MainClass {
	
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("진행하실 번호를 입력하세요");
		System.out.println("1.가입.2.로그인 3.수정 4.삭제");
		System.out.print("> ");
		IUserService iu;
		int menu = sc.nextInt();
		
		if(menu == 1) {
			iu = new Join();
			iu.execute();
		} else if(menu ==2) {
			iu = new Login();
			iu.execute();
		} else if(menu ==3) {
			iu = new Update();
			iu.execute();
		} else if (menu==4) {
			iu = new Delete();
			iu.execute();
		}
	}

}
