import java.util.ArrayList;
// we sort the list in this class.
import java.util.Collections;
public class SortedList {
	
	private ArrayList<String> sortedList;
	
	public SortedList(ArrayList<String> list) {
		Collections.sort(list);
		sortedList = list;
	}
//return sorted list
	public ArrayList<String> getSortedList() {
		return sortedList;
	}

}
