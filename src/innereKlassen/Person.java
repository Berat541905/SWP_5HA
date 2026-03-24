package innereKlassen;

public class Person {
	 
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	static class Details{
		public void showName(Person person) {
			System.out.println("Name: " + person.name);
		}
	}
	
	public static void main(String[] args) {
		Person person = new Person("Berat");
		Person.Details details = new Person.Details();
		details.showName(person);
	}
 
}
 