package generics.aufgabenBibliothek;

public class Book extends Media {
	 
	public Book(String title) {
		 super(title);
		 }
	    
	 @Override
	    public String kind() {
	    	return "book"; 	
	    }
}


