package innereKlassen;

public class Library {
	static String name = "Stadtbibliothek";
	 
    static class Book {
        static void showLibrary() {
            System.out.println("Bibliothek: " + Library.name);
        }
    }
 
    public static void main(String[] args) {
    	Book.showLibrary();
    }

}
