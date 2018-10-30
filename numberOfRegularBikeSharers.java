
/**
 * Computes number of regular bike-sharers (defined as someone who owns a pass, and who isn't a walk-up)
 * @author Stacie Barabas, University of Wisconsin-Madison
 *
 */
public class numberOfRegularBikeSharers implements Statistic<Integer> {
	private int numberOfRegularBikeSharers = 0;
	String regular = ""; // A String that is contained within a String to be counted
	int columnNumber = 0;
	
	/**
	 * Constructor with column number and string created so that the number of occurrences computation could be done on any column
	 * @param columnNumber Column on which the most popular computation is to be done
	 * @param regular A String that i contained within a String to be counted 
	 */
	public numberOfRegularBikeSharers(String regular, int columnNumber) {
		this.regular = regular;
		this.columnNumber = columnNumber;
	}

	/**
	 * Retrieves number of bike sharers
	 */
	@Override
	public Integer getStatistic() {
		return numberOfRegularBikeSharers;
	}

	/**
	 * Increments number of regular bike sharers when a regular bike sharer's file in read in
	 */
	@Override
	public void addCurrentRecordToStatistic(String[] currentRecord) {
		if (currentRecord[columnNumber].equals("") || !currentRecord[columnNumber].toLowerCase().contains(regular)) { return; }
		numberOfRegularBikeSharers++;
		return;
	}

}
