package wildcards;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Aufgabe 1
		Box<Integer> int1 = new Box<Integer>(54);
		Box<Integer> int2 = new Box<Integer>(54);
		System.out.println(Box.compareBoxes(int1, int2));
		
		// Aufgabe 2
		Container <Integer> integer = new Container<Integer>();
		integer.addElement(4);
		integer.addElement(5);
		System.out.println(Container.sumItems(integer));
	}

}
