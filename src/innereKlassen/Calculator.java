package innereKlassen;

public class Calculator {
	static class Addition {
        static int add(int a, int b) {
            return a + b;
        }
    }
 
    public static void main(String[] args) {
        int result = Addition.add(5, 3);
        System.out.println("Ergebnis: " + result);
    }
}