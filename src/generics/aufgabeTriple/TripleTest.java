package generics.aufgabeTriple;

public class TripleTest {

	public static void main(String[] args) {

		Triple<String, Double, Integer> triple = new Triple <String, Double, Integer>("Berat", 54.0, 54);
		System.out.println(triple.toString());
	}

}
