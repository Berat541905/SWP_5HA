package lamda;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaTest {

	public static void main(String[] args) {

		Runnable runnable = () -> {};
		
		ActionListener listener = l -> {};
		
		Supplier<String> supplier = () -> "Berat";
		
		Consumer<Point> consumer = p -> {};
		
		Comparator<Rectangle> comparator = (rectangle1, rectangle2) -> 0;
	}

}
