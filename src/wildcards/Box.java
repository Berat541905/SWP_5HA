package wildcards;
 

public class Box<T> {
	private T value;
 
	public Box(T value) {
     this.value = value;
}
 
public T getValue() {
     return value;
}
 
public void setValue(T value) {
     this.value = value;
}
 
 
public static boolean compareBoxes(Box<?> b1, Box<?> b2) {
     if (b1.getValue() == null) {
         return b2.getValue() == null;
     }
     return b1.getValue().equals(b2.getValue());
}
}