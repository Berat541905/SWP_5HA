package generics;

public class PairTest {

	public static void main(String[] args) {

		        Integer i1 = 2;
		        Integer i2 = 3;
		        Pairr<Integer, Integer> iPair = new Pairr<>(i1, i2);
		        System.out.println("iPair: " + iPair.getFirst() + ", " + iPair.getSecond());

		        Double d1 = 4.0;
		        Double d2 = 5.0;
		        Pairr<Double, Double> dPair = new Pairr<>(d1, d2);
		        System.out.println("dPair: " + dPair.getFirst() + ", " + dPair.getSecond());

		        Dog dog1 = new Dog("Arda", "Pitbull");
		        Dog dog2 = new Dog("Bob", "Schäferhund");
		        Pairr<Dog, Dog> dogPair = new Pairr<>(dog1, dog2);

		        System.out.println(dogPair.getFirst().getName());
		        System.out.println(dogPair.getSecond().getRace());

		        Pairr<Dog, Dog> swappedDogs = dogPair.swap();
		        System.out.println(swappedDogs.getFirst().getName());
		    }
		

	}


