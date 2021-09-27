package entities5;

public abstract class Account5 {
	
	private Integer number;
	private String holder;
	protected Double balance;
	
	
	public Account5() {}


	public Account5(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}
	
	public void withDraw(double amount) { // RETIRAR
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}
