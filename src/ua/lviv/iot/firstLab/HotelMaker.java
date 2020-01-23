package ua.lviv.iot.firstLab;

public class HotelMaker {

	public static void main(String[] args) {

		Hotel leopolis = new Hotel(2180, "Leopolis", 57, 1225.0);
		Hotel grand = new Hotel();
		Hotel hilton = new Hotel(12720, "Hilton", 190, 9650.0, true, "Tarasa Shevchenko", "Kyiv");

		System.out.println(leopolis);
		System.out.println(grand);
		System.out.println(hilton);

		System.out.println("------------------------------------------------");
		System.out.println("Hotel Hilton after ResetValues():");
		hilton.resetValues(2503, "HiltonPl", 340, 146000.0, false, "none", "Katowice");
		System.out.println(hilton);

		System.out.println("------------------------------------------------");
		System.out.println("Default value of static field:");

		grand.printMinNumberOfRewiewsOnTripAdvisor();
		Hotel.printStaticMinNumberOfRewiewsOnTripAdvisor();

		Hotel.setMinNumberOfRewiewsOnTripAdvisor(15);

		System.out.println("------------------------------------------------");
		System.out.println("Value of static field after setting:");

		grand.printMinNumberOfRewiewsOnTripAdvisor();
		Hotel.printStaticMinNumberOfRewiewsOnTripAdvisor();

		int numberOfObjectsAccordingToTask = 4;
		int counterOfCreatedObjects = 0;

		Hotel[] arrayOfHotels = new Hotel[numberOfObjectsAccordingToTask];

		while (counterOfCreatedObjects < numberOfObjectsAccordingToTask) {
			arrayOfHotels[counterOfCreatedObjects] = new Hotel();
			counterOfCreatedObjects++;
		}

		for (Hotel currentHotel : arrayOfHotels) {
			System.out.println(currentHotel);
		}

	}

}
