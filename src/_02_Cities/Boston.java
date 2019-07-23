package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		this.population = population;
		this.growthRate = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		
		double getAnnualTaxes = population * growthRate;
		population = population/2;
		getAnnualTaxes = getAnnualTaxes + population;
		return getAnnualTaxes;
	}

}
