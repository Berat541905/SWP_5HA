package generics.aufgabeBox;

public class Box<T> {

	private final T value;

	public Box(T value) {
		super();
		this.value = value;
	}

	 public Box<T> set(T value) {
		  return new Box<>(value);
		 }
	
	public T getValue() {
		return value;
	}
	

}
