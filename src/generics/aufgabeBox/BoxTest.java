package generics.aufgabeBox;

public class BoxTest {

	 public static void main(String[] args) {
	  Box<String> name = new Box<String>("Berat");
	  Box<Integer> age = new Box<Integer>(19);
	  Box<Double> height = new Box<Double>(170.0);
	  System.out.println(name.getValue() + " " + age.getValue() + " " + height.getValue());
	 }

	}
