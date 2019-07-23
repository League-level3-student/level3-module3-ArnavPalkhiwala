package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		this.population = population;
		this.growthRate = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		
		growthRate = growthRate * 2;
		double getAnnualTaxes = population * growthRate; 
		return getAnnualTaxes;
	}

}
