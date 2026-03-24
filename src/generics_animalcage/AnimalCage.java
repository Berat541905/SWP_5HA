package generics_animalcage;

public class AnimalCage<T extends Animal> {

	private T animal;

	public AnimalCage(T animal) {
		this.animal = animal;
	}
	
	public void makeNoise() {
		animal.makeSound();
		
	}
}
