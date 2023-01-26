package day5;


class CityNotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CityNotFoundException(String message) {
		super(message);
	}
}

public class City {
	private String[]city;
	private int[]zipcode;
	public City(String[] city, int[] zipcode) {
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public void findCityByZipCode(int zipCode) throws CityNotFoundException {
		for(int i=0;i<zipcode.length;i++) {
			if(zipcode[i]==zipCode) {
				System.out.println("Zipcode is of City "+city[i]);
				return;
			}
		}

		throw new CityNotFoundException("No City Found with this zipcode");
	}
	
}
