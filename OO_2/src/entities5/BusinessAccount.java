package entities5;

public class BusinessAccount extends Account5 {

	private Double loanlimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanlimit) {
		super(number, holder, balance);
		this.loanlimit = loanlimit;
	}

	public Double getLoanlimit() {
		return loanlimit;
	}

	public void setLoanlimit(Double loanlimit) {
		this.loanlimit = loanlimit;
	}

	public void loan(double amount) {// lIMITE DE EMPRESTIMO
		if(amount <= loanlimit) {
			balance += amount - 10;
		}		
	}
	
	@Override
	public void withDraw(double amount) {//RETIRADA
		super.withDraw(amount);
		balance -= 2.0;
	}
}
