/**
 * Interface that will be implemented in other classes to get and compute statistics (e.g. numberOfRegularBikeSharers)
 * @author Stacie Barabas, University of Wisconsin-Madison
 * 
 * @param <E>
 */
public interface Statistic<E> {
	public E getStatistic(); // Implemented in other classes to retrieve a given statistic
	public void addCurrentRecordToStatistic(String [] currentRecord); // Implemented in other classes to add another record to the computation
	// of a statistic
}
