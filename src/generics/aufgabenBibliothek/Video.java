package generics.aufgabenBibliothek;

public class Video extends Media {

	public Video(String title) {
		super(title);
	}
	
	@Override
	public String kind() {
		return "video";
	}
}
