package coretutorial.Lesson10_Collections.ForTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample implements RunExample {

	private List<Integer> arrayList;

	public ArrayListExample(int[] newArray) {
		this.arrayList = new ArrayList<Integer>(newArray.length);
		for (int i : newArray) {
			arrayList.add(i);
		}
	}	

	public void startExample() {
			
		arrayList.add(1, 2);
		System.out.println();
	}

}
