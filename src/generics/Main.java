package generics;

public class Main {
    public static void main(String[] args) {
        Pairr pair = new Pairr<>("Arda", 31);
        System.out.println(pair.getFirst() + " " + pair.getSecond());

        Pairr swapped = pair.swap();
        System.out.println(swapped.getFirst() + " " + swapped.getSecond());
    }
}