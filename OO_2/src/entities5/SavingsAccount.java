package entities5;

public class SavingsAccount extends Account5{
	
	private Double interestRate;//TAXA DE JURO

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {//ATUALIZA��O
		balance += balance * interestRate;
	}
	
	@Override
	public void withDraw(double amount) {
		balance -= amount;
	}

}
