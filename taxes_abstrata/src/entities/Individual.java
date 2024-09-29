package entities;

public class Individual extends TaxPayer {

	private Double healthExpenses;
	
	public Individual() {
	}

	public Individual(String name, Double income, Double healthExpenses) {
		super(name, income);
		this.healthExpenses = healthExpenses;
	}
	
	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public final Double totalIncome() {
		if (super.income <= 20000) {
			return (super.income * 0.15) - (healthExpenses * 0.50);
		} else {
			return (super.income * 0.25) - (healthExpenses * 0.50);
		}
	}

}
