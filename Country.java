package labs.lab7;

/**
 * Represents a country in a travel record
 */
public class Country implements Comparable<Country> {
	private String name;
	private int population;

	/**
	 * Constructs a Country with the given name and population
	 * 
	 * @param name			country name
	 * @param population	population of country
	 */
	public Country(String name, int population) {
		this.name = name;
		this.population = population;
	}

	
	/**
	 * @return	name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * @return	population
	 */
	public int getPopulation() {
		return population;
	}
	
	
	@Override
	public int compareTo(Country otherObject) {
		Country other = (Country) otherObject;
		if (population < other.population)
			return -1;
		if (population == other.population)
			return 0;
		return 1;
	}
}
