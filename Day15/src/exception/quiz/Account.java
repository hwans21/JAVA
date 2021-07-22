package exception.quiz;

public class Account {

	/*
	 1. 잔액(balance: long)으로 멤버변수를 선언(private 제한자)
	 2. deposit: 입금기능
	    withDraw: 출금기능
	    getBalance: 잔액확인기능(return -> long)
	    
	 3. withDraw에서 잔액이 출금금액이 보다 작다면 예외를 발생시키는 코드를
	 작성해 보세요(MyException)
	 
	 4. AccountMain이라는 클래스를 작성하셔서 예외처리가 잘 되는지 확인해보세요
	 */
	
	private long balance;
	
	public Account(int num) throws MyException {
		if(num <=0) {
			throw new MyException("돈을 넣어야 계좌 개설이 되지!@");
		}
		this.balance = num;
		
	}
	
	public void deposit(long money) {//입금
		this.balance+=money;
	}
	public void withDraw(long money) throws MyException { // 출금
		if(balance<money) throw new MyException("잔액이 부족합니다.");
		this.balance-=money;
	}
	public long getBalance() {
		return this.balance;
	}
}
