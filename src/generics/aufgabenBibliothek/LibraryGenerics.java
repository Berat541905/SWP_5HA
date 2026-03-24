package generics.aufgabenBibliothek;

public class LibraryGenerics<T extends Media> {
    private final java.util.List<T> media = new java.util.ArrayList<>();

    public void addMedia(T medium) {
        media.add(medium);
    }

    public Media retrieveLast() {
        if (media.isEmpty()) return null;
        return media.remove(media.size()-1);	
    }
    
}