package generics_transformer;

public class Main {

	public static void main(String[] args) {
		Transformer <Integer, String> intToString = new Transformer<>();
		String result = intToString.transform(42, Object ::toString);
		
		Transformer<Double,Integer> dti = new Transformer<>();
		Integer iResult = dti.transform(3.14, Double::intValue); 
	}

}
