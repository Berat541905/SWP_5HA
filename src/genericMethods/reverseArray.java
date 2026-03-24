package genericMethods;

import java.util.Arrays;

public class reverseArray {

	public static <T> T[] reverseArray(T[] a) {
	    for (int front = 0, back = a.length - 1;
	    		front < back; front++, back--) {
	        T tmp = a[front];   
	        a[front] = a[back]; 
	        a[back]  = tmp;     
	    }
	    return a;
	}


    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] stringArray = {"A", "B", "C"};
        
        System.out.println(Arrays.toString(reverseArray(intArray))); 		// Ausgabe [4, 3, 2, 1]
        System.out.println(Arrays.toString(reverseArray(stringArray))); 		// Ausgabe [C, B, A]	
    }
}