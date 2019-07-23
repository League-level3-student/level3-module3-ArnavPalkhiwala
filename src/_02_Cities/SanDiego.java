package _02_Cities;

public class SanDiego extends City {

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		this.population = population;
		this.growthRate = growthRate;
	}

	@Override
	double getAnnualTaxes() {

		double getAnnualTaxes = population * growthRate;
		getAnnualTaxes += 1000000;
		return getAnnualTaxes;
	}
}
