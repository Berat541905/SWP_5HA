package genericMethods;

public class counterGreaterThan {

	public static <T extends Comparable<T>> int counterGreaterThan(T[] array, T elem) {
		int count = 0;
		for (T y : array) {
			if(y.compareTo(elem) > 0) {
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[]args) {
		Integer[] numbers = {1, 3, 5, 7, 9};
		System.out.println(counterGreaterThan(numbers, 4));		// Ausgabe: 3
	}
	
}
