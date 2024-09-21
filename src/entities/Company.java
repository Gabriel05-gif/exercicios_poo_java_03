package entities;

public final class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		double totalTaxPaid;
		if (numberOfEmployees < 10) {
			totalTaxPaid = getAnnualIncome() * 0.16;
		} else {
			totalTaxPaid = getAnnualIncome() * 0.14;
		}
		return totalTaxPaid;
	}

}
