
public class Grade {
	int math;
	int science;
	int english;

	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	Grade() {
	}
	
	int average() {
		return (math+science+english)/3;
	}

}
