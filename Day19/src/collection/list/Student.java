package collection.list;

import java.util.Scanner;

public class Student {

	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	private String grade;
	
	private static Scanner sc = new Scanner(System.in);
	
	public Student() {
		//학생 객체가 생성되자마자 메서드를 호출해서 값을 입력 받아라.
		this.inputStuInfo();
		this.calcTotAvgGrade();
	}
	// 학생 정보를 받아서 객체화 시킬 메서드
	public void inputStuInfo() {
		System.out.println("# 성적 정보 입력을 시작합니다.");
		System.out.print("- 학번 : ");
		this.stuId=sc.next();
		System.out.print("- 이름 : ");
		this.name=sc.next();
		while(true) {
			try {
				System.out.print("국어: ");
				this.kor = sc.nextInt();
				System.out.print("영어: ");
				this.eng = sc.nextInt();
				System.out.print("수학: ");
				this.math = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("점수는 숫자로만 입력하세요!");
				sc.nextLine(); // 사용자가 입력한 잘못된 값을 걷기 위함
			}
		}
		
		
		
	}
	// 총점, 평균, 학점을 계산하는 메서드
	public void calcTotAvgGrade() {
		this.total = this.kor + this.eng + this.math;
		this.average = this.total/3.0;
		if(average>=90) this.grade = "A";
		else if(average>=80) this.grade = "B";
		else if(average>=70) this.grade = "C";
		else if(average>=60) this.grade = "D";
		else  this.grade = "F";
		
	}
	
	//학생의 성적정보를 출력하는 메서드
	public void outputStuInfo() {
		System.out.printf("%4s %5s %11d점 %10d점 %12d점 %12d점 %10.2f점 %13s\n",
				this.stuId, this.name,this.kor,this.eng,this.math,
				this.total,this.average,this.grade);
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
