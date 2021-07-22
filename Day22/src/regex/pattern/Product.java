package regex.pattern;

public class Product {

	private String day, store, grade,detail,price;
	public String getDay() {
		return day;
	}
	public String getStore() {
		return store;
	}
	public String getGrade() {
		return grade;
	}
	public String getDetail() {
		return detail;
	}
	public String getPrice() {
		return price;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public Product(String day, String store, String grade, String detail, String price) {
		super();
		this.day = day;
		this.store = store;
		this.grade = grade;
		this.detail = detail;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [day=" + day + ", store=" + store + ", grade=" + grade + ", detail=" + detail + ", price="
				+ price + "]";
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
}
