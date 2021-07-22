
public class Account {

	String name;
	int password;
	int balance;
	
	Account(String aname, int apassword, int abalance){
		name = aname;
		password = apassword;
		balance = abalance;
		viewBalance();
	}
	Account(int apassword, int abalance,String aname){
		name = aname;
		password = apassword;
		balance = abalance;
		viewBalance();
	}
	Account(){}
	
	//잔액 출력
	void viewBalance() {
		System.out.println(name+"님의 현재 잔액 : "+balance);
	}
	void deposit(int money) {
		System.out.println(money+"원이 입금되었습니다.");
		balance += money;
		viewBalance();
	}
	void withDraw(int money) {
		System.out.println(money+"원이 출금되었습니다.");
		balance -= money;
		viewBalance();
	}
	int getbalance() {
		return balance;
	}
	
}
