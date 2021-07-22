package inter.basic2;

public interface Printer {
	
	void turnOn();
	void turnOff();
	void print(String document);
	void colorPrint(String document, String color);
	int copy(int n);

	
}
