package lamda;

import java.util.Random;
import java.util.function.Supplier;

public class Task2 {
    public static void main(String[] args) {

        Random r = new Random();
        Supplier<Integer> randomsupplier = () -> r.nextInt(100) + 1;

        System.out.println(randomsupplier.get());
        System.out.println(randomsupplier.get());
        System.out.println(randomsupplier.get());
    }
}
