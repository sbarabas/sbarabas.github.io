import java.util.HashMap;
import java.util.Map;

public class mostPopularEndingStation implements Statistic<String> {
	HashMap<String, Integer> endingStations = new HashMap<String, Integer>();

	@Override
	public String getStatistic() {
		int greatestValue =-1;
		String mostPopularStart = "";
		// TODO Auto-generated method stub
		for (Map.Entry<String,Integer> e: endingStations.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();
			if (value > greatestValue) { 
				mostPopularStart = key;
				greatestValue = value;
			}
		}
		return mostPopularStart;
	}

	@Override
	public void addCurrentRecordToStatistic(String[] currentRecord) {
		if(currentRecord[7].equals("")) { return; }
		if (endingStations.get(currentRecord[7]) == null) {endingStations.put(currentRecord[7],0); }
		endingStations.put(currentRecord[7], endingStations.get(currentRecord[7]) + 1);
		return;
	}
}
