public interface Statistic<E> {
	public E getStatistic();
	public void addCurrentRecordToStatistic(String [] currentRecord);
}
