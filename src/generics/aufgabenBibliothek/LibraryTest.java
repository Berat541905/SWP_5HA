package generics.aufgabenBibliothek;

public class LibraryTest {

	public static void main(String[] args) {
		 Library bib = new Library();
		 	bib.addMedia(new Book("Harry Potter"));
		 	bib.addMedia(new Video("IshowSpeed"));
	        System.out.println(bib.retrieveLast());
	    }
	
}
