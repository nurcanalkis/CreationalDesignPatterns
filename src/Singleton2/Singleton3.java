package Singleton2;

public class Singleton3 {
	
	// Eager initialization
	
	private static final Singleton3 INSTANCE = new Singleton3();

	private Singleton3() {
		// DoNothing
	}

	public static Singleton3 getInstance() {
		return INSTANCE;
	}

	public void connect() {
		System.out.println("Connecting to the database...");
	}

	public void disconnect() {
		System.out.println("Disconnecting...");
	}
}
