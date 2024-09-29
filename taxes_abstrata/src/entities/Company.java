package entities;

public class Company extends TaxPayer {
	private Integer numEmployees;
	
	public Company() {
	}
	
	public Company(String name, Double income, Integer numEmployees) {
		super(name, income);
		this.numEmployees = numEmployees;
	}

	public Integer getNumEmployees() {
		return numEmployees;
	}

	public void setNumEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}

	@Override
	public Double totalIncome() {
		if (numEmployees <= 10) {
			return super.income * 0.16;
		} else {
			return super.income * 0.14;
		}
	}
}
