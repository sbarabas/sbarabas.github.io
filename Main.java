import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Runs a bikesharing program that computes the most frequent String in a column of data and the number of regular bike sharers.
 * @author Stacie Barabas, University of Wisconsin-Madison
 *
 */
public class Main {

	public static void main(String[] args) {
		Statistic<String> mostPopularStart = new mostPopular(4);
		Statistic<String> mostPopularEnd = new mostPopular(7);
		Statistic<Integer> bikeSharing = new numberOfRegularBikeSharers();
		
		try {
			// Strategy used in this program is to do computations as the file is read in, so the file's contents
			// don't have to be stored in memory
			Scanner s = new Scanner(new File("metro-bike-share-trip-data.csv"));
			s.nextLine(); // To ignore header on data
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
