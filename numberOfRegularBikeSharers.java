
public class numberOfRegularBikeSharers implements Statistic<Integer> {
	private int numberOfRegularBikeSharers = 0;

	@Override
	public Integer getStatistic() {
		// TODO Auto-generated method stub
		return numberOfRegularBikeSharers;
	}

	@Override
	public void addCurrentRecordToStatistic(String[] currentRecord) {
		// TODO Auto-generated method stub
		if (currentRecord[13].equals("") || !currentRecord[13].toLowerCase().contains("pass")) { return; }
		numberOfRegularBikeSharers++;
		return;
	}

}
