package exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {

		/*
		 나오는 에러
		 - 문자입력
		 - 0으로 나눌때
		 - 배열초과
		 - 널 포인터 
		 */
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		try {
			System.out.print("정수 : ");
			int n = sc.nextInt();
			
			int result = 100/n;
			System.out.println(arr[result]);
			
			String s  = null;
			// String객체가 찾아가는 주소값이 null이므로 찾아갈 수 없음
			
			s.equals("안녕");
			// 따라서 equals함수가 실행될 수 없다.
			// 그러면 문자열을 비워줄 때에는 ""로 처리를 해야하나요?
			
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println("입력값이 잘못되었습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났어요!");
		} catch (NullPointerException e) {
			System.out.println("주소값에 null을 참조하는 에러입니다.");
		} catch(Exception e) {
			System.out.println("알 수 없는 에러가 발생했습니다.");
			e.getMessage();
		}

		
		
		System.out.println("프로그램 정상 종료!");
		sc.close();
	}
}
