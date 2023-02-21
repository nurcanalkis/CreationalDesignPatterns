package Singleton2;

public class Singleton4 {

	// Static block initialization

	private static Singleton4 INSTANCE;

	private Singleton4() {
		// DoNothing
	}

	static {
		try {
			INSTANCE = new Singleton4();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static Singleton4 getInstance() {
		return INSTANCE;
	}

	public void connect() {
		System.out.println("Connecting to the database...");
	}

	public void disconnect() {
		System.out.println("Disconnecting...");
	}
}
