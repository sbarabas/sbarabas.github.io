import java.util.HashMap;
import java.util.Map;

public class mostPopularStartingStation implements Statistic<String> {
	HashMap<String, Integer> startingStations = new HashMap<String, Integer>();

	@Override
	public String getStatistic() {
		int greatestValue =-1;
		String mostPopularStart = "";
		// TODO Auto-generated method stub
		for (Map.Entry<String,Integer> e: startingStations.entrySet()) {
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
		// TODO Auto-generated method stub
		if(currentRecord[4].equals("")) { return; }
		if (startingStations.get(currentRecord[4]) == null) {startingStations.put(currentRecord[4],0); }
		startingStations.put(currentRecord[4], startingStations.get(currentRecord[4]) + 1);
		return;
	}
	
	

}
