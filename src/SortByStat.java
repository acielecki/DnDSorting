//Compares stats for sorting using Collections
import java.util.Comparator;
class SortByStat implements Comparator<Sorted> {
	public int compare(Sorted c1, Sorted c2) {
		return c1.getStat()-c2.getStat();
	}
}
