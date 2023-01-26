package day5;

public class CityTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c=new City(new String[] {"A","B","C"},new int[] {11023,24510,71223});
		
		try {
			c.findCityByZipCode(11023);
			c.findCityByZipCode(24574);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
