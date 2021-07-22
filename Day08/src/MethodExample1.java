import java.lang.reflect.Array;
import java.util.Arrays;

/*
 # 메서드(method)
 - 메서드는 반복되는 코드 블록에 이름을 붙여놓은 것입니다.
 - 메서드는 반복되는 코드를 줄여주고
 좀 더 구조화 시켜서 우리가 코드를 알아보기 쉽게 합니다.(코드의 모듈화)
 - 메서드는 선언하는 과정과 호출하는 과정으로 나누어집니다.
 - 메서드의 선언은 메서드 내부에서는 불가능합니다.
 - 새로운 메서드의 선언은 반드시 메서드 블록 외부 and
  클래스 블록 내부에서만 가능합니다.
 
 - 메서드의 호출은 메서드나 생성자 내부에서만 가능합니다.
 - 메서드의 호출은 곧 메서드를 사용하는 것을 의미하며, 
 1. 메서드가 필요로 하는 데이터(매개값)을 호출부로 전달하면
 2. 그 값을 받아서 메서드 내부 로직이 실행되고
 3. 실행 결과값을 호출부로 다시 반환합니다.
 
 */
public class MethodExample1 {

	// 메서드의 선언 (static은 뒤에서 알려줄예정. 지금은 없다 생각)
	static int calcTotal(int x) {
		int total = 0;
		for (int i = 1; i <= x; i++) {
			total += i;
		}
		System.out.printf("1 ~ %d까지의 누적합: \t%d\n", x, total);
		return total;
	}

	public static void main(String[] args) {

		int[] num = new int[10];
		int count = 0;
		for (int i = 100; i <= 1000; i = i + 100) {

			num[count]=calcTotal(i);
			count++;
		}
		System.out.println(Arrays.toString(num));
	}

}
