package Singleton2;

public class App {

	private static Singleton2 o1 = null;
	private static Singleton2 o2 = null;
	private static Singleton2 o3 = null;

	public static void main(String[] args) {

		new Thread(() -> {
			o1 = Singleton2.getInstance();
		}).start();

		 new Thread(() -> {
			o2 = Singleton2.getInstance();
		}).start();

		 new Thread(() -> {
			o3 = Singleton2.getInstance();
		}).start();

		if (o1 == o2 && o1 == o3 && o2 == o3)
			System.out.println("The objects are the same...");
		else
			System.out.println("Not same");
	}
}
