package generics_listbox;

import generics_listbox.listBox;

public class listBoxTest {

	public static void main(String[] args) {
		listBox<Double> doubleBox = new listBox<>();
		doubleBox.addElement(10.0);
		doubleBox.addElement(10.9);
		doubleBox.addElement(10.1);
		
		System.out.println(doubleBox.sumElements());
	}

}
