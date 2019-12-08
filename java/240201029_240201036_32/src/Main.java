
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ac");
		list.add("dc");
		list.add("bb");
		list.add("aa");
		
		SortedList sl = new SortedList(list);
		
		Iteration<String> iterationList = new Iteration<String>(sl.getSortedList());
		
		System.out.println(iterationList.next());
		System.out.println(iterationList.hasNext());
		System.out.println(iterationList.next());
		System.out.println(iterationList.hasNext());
		System.out.println(iterationList.next());
		System.out.println(iterationList.hasNext());
		System.out.println(iterationList.next());
		System.out.println(iterationList.hasNext());
		
	}

}
