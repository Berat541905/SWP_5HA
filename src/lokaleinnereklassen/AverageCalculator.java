package lokaleinnereklassen;

public class AverageCalculator {
	
	public static double calculateAverage(int[]numbers) {
		
		class AverageCalculatorTask{
			public double berechne () {
				double summe = 0;
				double anzahl = numbers.length;
				
				for (int n : numbers) {
					summe += n;
				}
				return summe / anzahl;
			}
		}
		AverageCalculatorTask ac = new AverageCalculatorTask();
		double ergebnis = ac.berechne();
		System.out.println("Durchschnitt " + ergebnis);
		
		return ergebnis;
	}

	public static void main (String[]args) {
		int[] werte = {5, 10, 15, 20};
		calculateAverage(werte);
	}
}
