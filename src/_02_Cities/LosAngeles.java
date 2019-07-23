package _02_Cities;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		this.population = population;
		this.growthRate = growthRate;

	}

	@Override
	double getAnnualTaxes() {

		double getAnnualTaxes = growthRate * population;
		growthRate = growthRate/2;
		getAnnualTaxes = getAnnualTaxes * growthRate;
		return getAnnualTaxes;
	}

}
