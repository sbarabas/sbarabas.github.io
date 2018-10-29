import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Statistic<String> mostPopularStart = new mostPopularStartingStation();
		Statistic<String> mostPopularEnd = new mostPopularEndingStation();
		Statistic<Integer> bikeSharing = new numberOfRegularBikeSharers();
		
		try {
			Scanner s = new Scanner(new File("metro-bike-share-trip-data.csv"));
			s.nextLine();
			while(s.hasNextLine()) {
				String currentTripString = s.nextLine();
				String [] currentRecord = currentTripString.split(",");
				mostPopularStart.addCurrentRecordToStatistic(currentRecord);
				mostPopularEnd.addCurrentRecordToStatistic(currentRecord);
				bikeSharing.addCurrentRecordToStatistic(currentRecord);
			}
			System.out.println(bikeSharing.getStatistic());
			System.out.println(mostPopularStart.getStatistic());
			System.out.println(mostPopularEnd.getStatistic());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
