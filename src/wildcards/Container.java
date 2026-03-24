package wildcards;
 
import java.util.*;
 
public class Container<T> {
private List<T> elements = new ArrayList<T>();
 
public void addElement(T element) {
     elements.add(element);
}
 
public List<T> getElements() {
     return elements;
}
 
// Obergrenze: akzeptiert Container mit Typ, der Number erweitert
public static double sumItems(Container<? extends Number> c) {
     double sum = 0;
     for (Number n : c.getElements()) {
         sum += n.doubleValue();
     }
     return sum;
}
}