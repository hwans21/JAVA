package lambda.quiz;

public class Data {

	
	private String region; // 지역
	private String size; // 평수
	private String year;
	private String month;
	private String price; //평당 가격
	
	
	public Data() {	}


	public Data(String region, String size, String year, String month, String price) {
		super();
		this.region = region;
		this.size = size;
		this.year = year;
		this.month = month;
		this.price = price;
	}


	public String getRegion() {
		return region;
	}


	public String getSize() {
		return size;
	}


	public String getYear() {
		return year;
	}


	public String getMonth() {
		return month;
	}


	public String getPrice() {
		return price;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public void setYear(String year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Data [region=" + region + ", size=" + size + ", year=" + year + ", month=" + month + ", price=" + price
				+ "]";
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
}
