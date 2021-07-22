
public class Array2DQuiz {
	public static void main(String[] args) {
		int[][] score = { { 79, 80, 99 }, // A학생
				{ 95, 85, 89 }, // B학생
				{ 90, 65, 56 }, // C학생
				{ 69, 78, 77 } // D학생
				// 과목: 3과목
		};
		String[] stuName = { "A학생", "B학생", "C학생", "D학생" };
		String[] subName = { "국어", "영어", "수학" };

		double[] stuAvg = new double[4];
		double[] subAvg = new double[3];
		double classAvg = 0.0;

		/*
		 * 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해보세요
		 * 
		 * 2. 각 과목의 평균을 출력해보세요
		 * 
		 * 3. 반 평균도 출력해보세요
		 */
		 int i,j;
		 
		 System.out.println("----과목평균----");
		 // 각 학생의 평균
		 for(i=0; i<score.length; i++) {
			 for(j=0; j<score[i].length; j++) {
				 stuAvg[i] += score[i][j]; 
			 }
			 stuAvg[i] /= j; 
			 System.out.print(stuName[i]);
			 System.out.printf("의 평균 : %.1f\n",stuAvg[i]);
		 }
		i = 0;
		j = 0;
		 
		// 각 과목의 평균
		System.out.println("----학생평균----");
		for(j=0; j<score[i].length; j++) {
			 for(i=0; i<score.length; i++) {
				 subAvg[j] += score[i][j]; 
			 }
			 subAvg[j] /= i; 
			 i=0;
			 System.out.print(subName[j]);
			 System.out.printf("의 평균 : %.1f\n",subAvg[j]);
		 }
		 
		 // 반 평균?
		System.out.println("----반 평균----");
		 for(i=0; i<stuAvg.length; i++) {
			 classAvg += stuAvg[i];
		 }
		 classAvg/=i;
		 
		 System.out.printf("반평균 : %.1f\n",classAvg);

//		 강사님 작성
//		
//		System.out.println("==========강사님 작성=========");
//		// 1번(어차피 모든 요소를 다 참조를 해야하니 향상 for문으로 접근)
//		double totalAvg = 0.0;
//
//		int count = 0;
//		for (int[] stu : score) {
//			int total = 0; // 배열 덩어리가 바뀔 때 마다 total이 초기화되어야 하기 때문
//			for (int s : stu) {
//				total += s;
//
//			}
//			double avg = (double) total / subName.length;
//			totalAvg += avg;
//			System.out.printf("%s 평균: %.1f점\n", stuName[count], avg);
//			count++;
//		}
//
//		System.out.println("--------------------------------");
//
//		// 2번(향상 for문보단 인덱싱으로 접근하는게 편하겠다)
//		// score[0][0]
//		// score[1][0]
//		// score[2][0]
//		// score[3][0]
//
//		for (int i = 0; i < subName.length; i++) {
//			int total = 0;
//			for (int j = 0; j < stuName.length; j++) {
//				total += score[j][i];
//			}
//			double avg = (double) total / stuName.length;
//			System.out.printf("%s 평균 : %.1f\n", subName[i], avg);
//		}
//
//		// 3번 (학생평균을 다 더해서 평균을 더하겠다)
//		totalAvg /= stuName.length;
//		System.out.printf("반 평균 : %.1f\n", totalAvg);
	}
}
