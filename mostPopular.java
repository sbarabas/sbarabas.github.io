import java.util.HashMap;
import java.util.Map;

/**
 * Calculates most frequent String in a column of data
 * @author Stacie Barabas, University of Wisconsin-Madison
 *
 */
public class mostPopular implements Statistic<String> {
	HashMap<String, Integer> stations = new HashMap<String, Integer>();
	int columnNumber = 0;
	/**
	 * Constructor with column number created so that most popular computation could be done on any column
	 * @param columnNumber Column on which the most popular computation is to be done
	 */
	public mostPopular(int columnNumber) {
		this.columnNumber = columnNumber;
	}

	/**
	 * Retrieves most popular by iterating through HashMap
	 */
	@Override
	public String getStatistic() {
		int greatestValue =-1;
		String mostPopular = "";
		for (Map.Entry<String,Integer> e: stations.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();
			if (value > greatestValue) { 
				mostPopular = key;
				greatestValue = value;
			}
		}
		return mostPopular;
	}

	/**
	 * Computing the number of occurrences of Strings by incrementing the
	 * value of a HashMap
	 */
	@Override
	public void addCurrentRecordToStatistic(String[] currentRecord) {
		// Line below accounts for improper data entry
		if(currentRecord[columnNumber].equals("")) { return; }
		// Line below accounts for case where there is not yet a value
		if (stations.get(currentRecord[columnNumber]) == null) {stations.put(currentRecord[columnNumber],0); }
		stations.put(currentRecord[columnNumber], stations.get(currentRecord[columnNumber]) + 1);
		return;
	}
	
	

}
