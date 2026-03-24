package generics.aufgabenBibliothek;

public abstract class Media {
	   String title;

	    public Media(String title) {
	        this.title = title;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public abstract String kind();

	    @Override
	    public String toString() {
	        return kind() + ": " + title;
	    }
	}
	
	


