package lamda;

import java.util.function.DoubleSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.UnaryOperator;

public class lambda2 {

	public static void main(String[] args) {

		DoubleSupplier ds =  () -> 54.0;
		
		LongToDoubleFunction ltdf = value -> value * 1.5;
		
		UnaryOperator<String> up = text -> text + text;
	}

}
