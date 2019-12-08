import java.util.ArrayList;
// Iteration class 
public class Iteration<T> implements IIteration<T> {
	
	private ArrayList<T> list;
	private int tempIndex;
	
	public Iteration(ArrayList<T> list) {
		this.list = list;
		tempIndex = -1;
	}
	//	gives the other element in the list
	public T next() {
		if(hasNext()) {
			tempIndex++;
		}
		return list.get(tempIndex);
	}
	// check  the next elements
	public boolean hasNext() {
		if(tempIndex < list.size() - 1) {
			return true;
		}
		return false;
	}
}
