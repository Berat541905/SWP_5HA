package lamda;

public class Task1 {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 1; i < 11; i++) {
				System.out.println(i);
			}
		};
		r.run();
	}

}
