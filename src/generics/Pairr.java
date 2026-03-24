package generics;

import java.util.Objects;


public class Pairr<T, U> {
	
	private final T first;
	private final U second;
	
	
	public Pairr(final T first, final U second) {
		this.first = first;
		this.second = second;
	}


	public T getFirst() {
		return this.first;
	}


	public U getSecond() {
		return this.second;
	}
	
		
	public Pairr<U, T> swap() {
       return new Pairr<>(second, first);
   }
	

}