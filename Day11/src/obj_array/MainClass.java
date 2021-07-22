package obj_array;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
//		1번
		User u1 = new User("김",10,30);
//		u1.userInfo();
		System.out.printf("아이디: %s\n비밀번호: %d\n나이: %d\n",
				u1.getId(),u1.getPw(),u1.getAge());
		
		System.out.println("------------");
//		2번
		User[] arru2 = new User[2];
		arru2[1] = new User("김길동",456456,30);

//		arru2[0] = User;
//		arru2[1] = User;
//		

		
		for(User i : arru2) {
//			i.userInfo();
			System.out.println("아이디: "+i.getId());
			System.out.println("비밀번호: "+i.getPw());
			System.out.println("나이: "+i.getAge());
		}
		
//		3번
		User[] arru5 = new User[5];
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<arru5.length) {
			arru5[i] = new User();
			System.out.print("ID : ");
			arru5[i].setId(sc.next());

			System.out.print("PW : ");
			arru5[i].setPw(sc.nextInt());

			System.out.print("AGE : ");
			arru5[i].setAge(sc.nextInt());
			
			System.out.println("----------------");
			
			i++;
		}
		
		System.out.println(Arrays.toString(arru5));
		
		
		
	}

}
