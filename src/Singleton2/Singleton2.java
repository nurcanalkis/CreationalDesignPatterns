package Singleton2;


public class Singleton2 {

	// Lazy Initialization

	private static Singleton2 INSTANCE;

	private Singleton2() {
		// DoNothing
	}

	public static Singleton2 getInstance() {
		if (INSTANCE == null) {
			for (int i = 0; i < 100; i++) {
				
			}
			
			INSTANCE = new Singleton2();
		}
		return INSTANCE;
	}

	public void connect() {
		System.out.println("Connecting to the database...");
	}

	public void disconnect() {
		System.out.println("Disconnecting...");
	}
}
