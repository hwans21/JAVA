package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		List<Student> sList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		Point p = new Point();

		while (true) {
			int menu = p.menuInfo();

			switch (menu) {
			case 1: {

				p.inputPoints(sList);
				break;
			}
			case 2: {
				p.showAllPoints(sList);
				break;
			}
			case 3: {
				p.searchPoint(sList);
				break;

			}
			case 4: {
				p.modifyPoint(sList);
				break;

			}
			case 5: {

				p.deletePoint(sList);
				break;
			}
			case 6: {
				System.out.println("enter키를 누르시면 종료됩니다.");
				sc.nextLine();
				sc.close();
				System.exit(0); // 프로그램 강제 종료 메서드

			}
			default:
				System.out.println("메류를 잘못 입력하셨습니다.");

			}

		}

	}
}
