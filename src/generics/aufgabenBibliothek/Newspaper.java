package generics.aufgabenBibliothek;

public class Newspaper extends Media {

	public Newspaper(String title) {
		super(title); 
		}
    
	@Override
	public String kind() {
		return "newspaper"; 	
	}


}
