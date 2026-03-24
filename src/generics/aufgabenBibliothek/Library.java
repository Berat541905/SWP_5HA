package generics.aufgabenBibliothek;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private final List<Media> media = new ArrayList<>();

    public void addMedia(Media medium) {
        media.add(medium);
    }
 
    public Media retrieveLast() {
        if (media.isEmpty()) return null;
        return media.remove(media.size()-1);
    }
}

