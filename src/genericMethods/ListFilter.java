package genericMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFilter {

	
		public static <T extends Comparable <T>> List<T> filterList(List<T> list, T Schwellwert){
			List<T> result = new ArrayList<>();
	        for (T element : list) {
	            if (element.compareTo(Schwellwert) > 0) {
	                result.add(element);
	            }
	        }
	        return result;
		}	



	    public static void main(String[] args) {
	    	List<Integer> numbers = Arrays.asList(1, 5, 10, 20);
	    	System.out.println(filterList(numbers, 5));
	    
	    
	    
	    }

}
