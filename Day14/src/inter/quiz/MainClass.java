package inter.quiz;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
		 - 인터페이스 타입으로 객체를 생성하고,
		 무한루프 안에서 메뉴를 입력받아서
		 음악추가기능, 재생기능, 종료기능
		 
		 를 작성해 보세요
		 */
		

		int menu;
		Scanner sc  = new Scanner(System.in);
		
		SongList list;
		
		System.out.println("스트리밍프로그램");
		System.out.println("원하시는 플래이어를 입력하세요");
		System.out.println("1. 멜론 | 2. 지니");
		int select = sc.nextInt();
		if(select ==1) 
			list = new MelonMusic();
		 else
			list = new GenieMusic();
		
		main: while(true) {
			System.out.println("******메뉴*****");
			System.out.println("1. 음악추가");
			System.out.println("2. 음악재생");
			System.out.println("3. 종료");
			System.out.print("메뉴 : ");
			menu = sc.nextInt();
			switch (menu) {
			case 1: 
				String songname;
				System.out.print("추가할 곡 이름: ");
				songname = sc.next();
				list.insertList(songname);
				System.out.println("곡 개수"+list.playLength());
				break;
			
			case 2:
				System.out.println("음악을 재생합니다.");
				System.out.println("재생 목록");
				list.playList();
				sc.nextLine();
				break;
				
			
			case 3:{
				System.out.println("프로그램을 종료합니다.");
				break main;
			}
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		
			
		}
		sc.close();
	}
}
