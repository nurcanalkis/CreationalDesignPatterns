package Singleton2;

public class Singleton6 {

	// Thread Safe Singleton 2

	private static Singleton6 INSTANCE;

	private Singleton6() {
		// DoNothing
	}

	public static Singleton6 getInstance() {
		if (INSTANCE == null) {
			synchronized (Singleton6.class) {
				if (INSTANCE == null) {
					 INSTANCE = new Singleton6();
				}
			}
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
