
public class TV {

	String name;
	int year;
	int inch;

	TV() {
	}

	TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;

	}
	//LG에서 만든 2017년형 32인치 TV
	void show() {
		System.out.println(name+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
}
