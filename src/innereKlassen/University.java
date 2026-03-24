package innereKlassen;

public class University {
	
	public class Student {
		public void showData(String name, int id) {
			System.out.println("Name: " + name + " ID: " + id);
		}
		
	}
	
	public static void main(String[]args) {
		Student s = new University().new Student();
		s.showData("Berat", 1);
	}

}
