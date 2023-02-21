package Singleton2;

public class Singleton8 {

	// Singleton Using Volatile Bean Pattern

	private static volatile Singleton8 INSTANCE;
	private static final Object MUTEX = new Object();

	private Singleton8() {
		// DoNothing
	}

	public static Singleton8 getInstance() {
		Singleton8 singleton = INSTANCE;
		if (singleton != null)
			return singleton;
		synchronized (MUTEX) {
			if (INSTANCE == null)
				INSTANCE = new Singleton8();
			return INSTANCE;
		}
	}

	public void connect() {
		System.out.println("Connecting to the database...");
	}

	public void disconnect() {
		System.out.println("Disconnecting...");
	}

}
