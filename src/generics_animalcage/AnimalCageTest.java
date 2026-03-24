package generics_animalcage;

import generics_animalcage.AnimalCage;
import generics_animalcage.Cat;

public class AnimalCageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog arda = new Dog();
		AnimalCage<Dog> mert2 = new AnimalCage<Dog>(arda);
		AnimalCage<Cat> kutay = new AnimalCage<Cat>(new Cat());
		mert2.makeNoise();
		kutay.makeNoise();
	

	}

}
