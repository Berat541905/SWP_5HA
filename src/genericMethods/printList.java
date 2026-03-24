package genericMethods;

import java.util.Arrays;
import java.util.List;


public class printList {

	public static void printList(List<?> list) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
		      sb.append(list.get(i));
	            if (i < list.size() - 1) sb.append(", ");
	        }
	        System.out.println(sb.toString());
	    }
		
	
	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("One", "Two", "Three");
		List<Integer> intList = Arrays.asList(1, 2, 3);
		
		printList (stringList);		// Ausgabe: One, Two, Three
		printList (intList);		// Ausgabe : 1, 2, 3
	}

}
