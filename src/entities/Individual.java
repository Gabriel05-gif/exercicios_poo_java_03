package entities;

public final class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double totalTaxPaid;
		if (getAnnualIncome() < 20000.00) {
			if (healthExpenditures > 0.0) {
				totalTaxPaid = (getAnnualIncome() * 0.15) - (healthExpenditures * 0.50);
			} else {
				totalTaxPaid = (getAnnualIncome() * 0.15);
			}
		} else {
			if (healthExpenditures > 0.0) {
				totalTaxPaid = (getAnnualIncome() * 0.25) - (healthExpenditures * 0.50);
			} else {
				totalTaxPaid = (getAnnualIncome() * 0.25);
			}
		}
		return totalTaxPaid;
	}
}
