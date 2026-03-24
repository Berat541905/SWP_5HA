package generics_shape;

public class SortableBox<T extends Comparable<T>> {
	
	private final T content;
	
	public SortableBox(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}
	
	public int compareToOtherBox(SortableBox<T> example) {
		return(this.content.compareTo(example.getContent()));
	}
}