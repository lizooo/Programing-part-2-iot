package ua.lviv.iot.firstLab;

public class Hotel {

	public static final String DEFAULT_STREET = "Undefined";
	public static final String DEFAULT_CITY = "Undefined";
	public static final String DEFAULT_NAME = "Undefined";
	
	private static int minNumberOfRewiewsOnTripAdvisor;
	private int numberOfVisitorsPerYear;
	private String name;
	private int numberOfRooms;
	private double cheapestPriceInHrn;
	private boolean isFullyBooked;

	protected String streetLocation;
	protected String cityLocation;
	
	
	public Hotel(int numberOfVisitorsPerYear, String name, int numberOfRooms, double cheapestPriceInHrn,
			boolean isFullyBooked, String streetLocation, String cityLocation) {
		this.numberOfVisitorsPerYear = numberOfVisitorsPerYear;
		this.name = name;
		this.numberOfRooms = numberOfRooms;
		this.cheapestPriceInHrn = cheapestPriceInHrn;
		this.isFullyBooked = isFullyBooked;
		this.streetLocation = streetLocation;
		this.cityLocation = cityLocation;
	}
	
	public Hotel() {
		this(0, DEFAULT_NAME, 0, 0.0, false, DEFAULT_STREET, DEFAULT_CITY );
	}
	
	public Hotel(int numberOfVisitorsPerYear, String name, int numberOfRooms, double cheapestPriceInHrn) {
		this(numberOfVisitorsPerYear, name, numberOfRooms, cheapestPriceInHrn, false, DEFAULT_STREET, DEFAULT_CITY);
	}
	
	public static void PrintStaticMinNumberOfRewiewsOnTripAdvisor() {
		System.out.println(Hotel.minNumberOfRewiewsOnTripAdvisor);
	}
	
	public void PrintMinNumberOfRewiewsOnTripAdvisor() {
		System.out.println(Hotel.minNumberOfRewiewsOnTripAdvisor);
	}
	
	public void ResetValues(int numberOfVisitorsPerYear, String name, int numberOfRooms, double cheapestPriceInHrn,
			boolean isFullyBooked, String streetLocation, String cityLocation) {
		this.numberOfVisitorsPerYear = numberOfVisitorsPerYear;
		this.name = name;
		this.numberOfRooms = numberOfRooms;
		this.cheapestPriceInHrn = cheapestPriceInHrn;
		this.isFullyBooked = isFullyBooked;
		this.streetLocation = streetLocation;
		this.cityLocation = cityLocation;
	}
	
	
	public static int getMinNumberOfRewiewsOnTripAdvisor() {
		return minNumberOfRewiewsOnTripAdvisor;
	}
	public static void setMinNumberOfRewiewsOnTripAdvisor(int minNumberOfRewiewsOnTripAdvisor) {
		Hotel.minNumberOfRewiewsOnTripAdvisor = minNumberOfRewiewsOnTripAdvisor;
	}
	public int getNumberOfVisitorsPerYear() {
		return numberOfVisitorsPerYear;
	}
	public void setNumberOfVisitorsPerYear(int numberOfVisitorsPerYear) {
		this.numberOfVisitorsPerYear = numberOfVisitorsPerYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public double getCheapestPriceInHrn() {
		return cheapestPriceInHrn;
	}
	public void setCheapestPriceInHrn(double cheapestPriceInHrn) {
		this.cheapestPriceInHrn = cheapestPriceInHrn;
	}
	public boolean isFullyBooked() {
		return isFullyBooked;
	}
	public void setFullyBooked(boolean isFullyBooked) {
		this.isFullyBooked = isFullyBooked;
	}
	public String getStreetLocation() {
		return streetLocation;
	}
	public void setStreetLocation(String streetLocation) {
		this.streetLocation = streetLocation;
	}
	public String getCityLocation() {
		return cityLocation;
	}
	public void setCityLocation(String cityLocation) {
		this.cityLocation = cityLocation;
	}
	
	@Override
	public String toString() {
		return "Hotel [minNumberOfRewiewsOnTripAdvisor= "+ minNumberOfRewiewsOnTripAdvisor +", "
				+ "numberOfVisitorsPerYear=" + numberOfVisitorsPerYear + ", name=" + name + ", numberOfRooms="
				+ numberOfRooms + ", cheapestPriceInHrn=" + cheapestPriceInHrn + ", isFullyBooked=" + isFullyBooked
				+ ", streetLocation=" + streetLocation + ", cityLocation=" + cityLocation + "]";
	}

	
	
}