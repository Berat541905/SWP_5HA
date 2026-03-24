package generics_listbox;

import java.util.ArrayList;
import java.util.List;

public class listBox<T extends Number> {
	
	private List<T> elements;

	public listBox() {
		this.elements =  new ArrayList<T>();
	}
	
	public List<T> getElements() {
		return elements;
	}
	
	public void setElements(List<T> elements) {
		this.elements = elements;
	}

	public void addElement(T elements) {
		this.elements.add(elements);		
	}
	
	public double sumElements() {
		double sum = 0;
		for (T e : elements) {
			sum += e.doubleValue();
		}
		return sum;
	}

}
