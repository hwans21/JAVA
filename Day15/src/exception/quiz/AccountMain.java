package exception.quiz;

public class AccountMain {

	public static void main(String[] args) {
		Account a = null;
		try {
			a = new Account(-9000);
		} catch (MyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		a.deposit(12000);
	
		try {
			a.withDraw(3000);
			a.withDraw(3000000);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("현재잔액 : "+a.getBalance());
	}
}
