package innereKlassen;

public class Mathematics {
	public static class Factorial {
		static int berechne (int n){
			int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }		
	}
    
	public static void main(String[] args) {
		System.out.println("Fakultät von 4: " + Factorial.berechne(4));
		System.out.println("Fakultät von 6: " + Factorial.berechne(6));
		System.out.println("Fakultät von 8: " + Factorial.berechne(8));

	}
}
