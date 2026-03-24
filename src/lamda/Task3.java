package lamda;

import java.util.function.Consumer;

public class Task3 {

	public static void main(String[] args) {

		Consumer <String> toUpperCaseConsumer = text -> System.out.println(text.toUpperCase());

		toUpperCaseConsumer.accept("arda");
		toUpperCaseConsumer.accept("berat");
	}

}
