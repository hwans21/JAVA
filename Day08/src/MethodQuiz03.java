
/*
 - 정수 2개를 입력받아서 두 숫자의 최대 공약수를 구해주는 메서드
 calcGCD()를 선언하세요.
 - 최대공약수: 두 숫자의 공통된 약수 중 가장 큰 약수
 # 임의의 두 자연수 a, b가 주어졌을 때, 둘 중 큰 값이 a라고 가정
 a를 b로 나눈 나머지를 n이라고 했을 때(a % b -> n)
 n이 0이 된다면 b가 최대 공약수입니다.
 
 # 만약 n이 0이 아니라면
 a에 b값을 다시 넣고
 b에 n을 대입한 후에 위의 행동을 반복
 
 ex>
 6 >> 1, 2, 3, 6
 18 >> 1, 2 ,3 ,6, 9, 18
 최대공약수 >> 6
 
  
 */
public class MethodQuiz03 {

	static int calcGCD(int a, int b) {
		int temp;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		while (true) {
			if (a % b == 0)break;
			else {
				temp = a % b;
				a = b;
				b = temp;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		int num1 = 26873850;
		int num2 = 1679610;
		System.out.printf("%d와 %d의 최대공약수: %d\n", num1, num2, calcGCD(num1, num2));
	}
}
