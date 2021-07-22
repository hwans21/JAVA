package obj_array;

public class Score {

	/*
	 * - 이름, 국어, 영어, 수학, 총점, 평균(double) 을 담을 수 있는 객체를 디자인하세요.
	 * 
	 * 
	 * - 학생의 모든 정보를 한 눈에 확인할 수 있게 scoreInfo()메서드를 선언해주세요 메서드 내부에는 출력문을 이용해서 모든 정보를
	 * 출력해 주세요.
	 * 
	 * - 은닉을 구현해서 작성해주세요.(생성자는 맘대로 하세요)
	 * 
	 * 
	 */

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	void scoreInfo() {
		this.total = this.kor + this.eng + this.math;
		this.avg = total/3.0;
		System.out.println("--------------------------");
		System.out.printf("이름 : %s  국어 : %d  영어 : %d  수학 : %d\n총점 : %d 평균 : %.2f\n",
				this.name, this.kor, this.eng, this.math, this.total, this.avg);
	}

	public Score() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
