package Singleton2;

public class Singleton5 {
	
	//Thread Safe Singleton 1
	
	private static Singleton5 INSTANCE;

	private Singleton5() {
		// DoNothing
	}

	public static synchronized Singleton5 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton5();
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
