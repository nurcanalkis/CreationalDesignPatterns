package Singleton2;

public class Singleton7 {

	// Bill Pugh Singleton Implementation

	private Singleton7() {
		// DoNothing
	}

	private static class SingletonHelper {
		private static final Singleton7 INSTANCE = new Singleton7();
	}

	public static Singleton7 getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	public void connect() {
		System.out.println("Connecting to the database...");
	}

	public void disconnect() {
		System.out.println("Disconnecting...");
	}
}
