package coretutorial.Lesson10_Collections.Core.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<String>();
		Set<String> ts = new TreeSet<String>();
		
		hs.add("ABC");
		hs.add("A");
		hs.add("B");
		hs.add("D");
		hs.add("E");
		System.out.println(hs);
		
	}

}
