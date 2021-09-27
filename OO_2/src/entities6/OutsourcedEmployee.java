package entities6;

public class OutsourcedEmployee extends Employee3{
	
	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getadditionalCharge() {
		return additionalCharge;
	}

	public void setadditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		 return super.payment() + additionalCharge * 1.1;
	}
	

}
