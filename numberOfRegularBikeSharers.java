
/**
 * Computes number of regular bike-sharers (defined as someone who owns a pass, and who isn't a walk-up)
 * @author Stacie Barabas, University of Wisconsin-Madison
 *
 */
public class numberOfRegularBikeSharers implements Statistic<Integer> {
	private int numberOfRegularBikeSharers = 0;

	/**
	 * Retrieves number of bike sharers
	 */
	@Override
	public Integer getStatistic() {
		// TODO Auto-generated method stub
		return numberOfRegularBikeSharers;
	}

	/**
	 * Increments number of regular bike sharers when a regular bike sharer's file in read in
	 */
	@Override
	public void addCurrentRecordToStatistic(String[] currentRecord) {
		// TODO Auto-generated method stub
		if (currentRecord[13].equals("") || !currentRecord[13].toLowerCase().contains("pass")) { return; }
		numberOfRegularBikeSharers++;
		return;
	}

}
