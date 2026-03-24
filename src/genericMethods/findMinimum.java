package genericMethods;

public class findMinimum {

	public static <T extends Comparable<T>> T findMin(T a, T b) {
		return a.compareTo(b) <= 0 ? a : b;
	}
	
    public static void main(String[] args) {
    	System.out.println(findMin(15, 10));		// Ausgabe: 10
    	System.out.println(findMin("Dog", "Cat"));	// Ausgabe: Cat
    }
}
