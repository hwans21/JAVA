package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Map<String, String> users = new HashMap<>();
		
		users.put("kim1234", "kkk1234");
		users.put("abc1234", "aaa1111");
		users.put("park4321", "ppp4321");
		
		/*
		 # 로그인 입력값 검증
		 1. 아이디를 입력받아서 아이디가 맵에 존재하는지를 확인한 후
		 비밀번호를 입력받아서 해당 비밀번호가 맞는지를 검증하는
		 로직을 작성합니다. 
		 
		 2. 아이디가 존재하지 않는다면 "존자ㅐ하지 않는 아이디입니다."
		 비밀번호가 틀렸다면 "비밀번호가 틀렸습니다."
		 둘 다 일치한다면 "로그인 성공!" 출력해 주세요
		 
		 3. 로그인 성공이 될 때까지 지속적으로 입력을 받을 수 있게
		 로직을 구현해 주세요.(로그인 성공 시 프로그램 종료)
		 */
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while(!flag) {
			System.out.print("ID : ");
			String id = sc.next();
			if(!users.containsKey(id)) {
				System.out.println("존재하지 않는 아이디 입니다.");
				sc.nextLine();
				continue;
			}
			System.out.print("PW : ");
			String pw=sc.next();
			if(!users.get(id).equals(pw)) {
				System.out.println("비밀번호가 일치하지 않습니다.");
				sc.nextLine();
				continue;
			}
			System.out.println("로그인 성공!");
			flag = true;
		}
		// 틀림
		sc.close();
	}
	
}
