package Singleton2;

public enum Singleton1 {
	
	//Enum Singleton
	INSTANCE;
	
	public void connect() {
		System.out.println("Connecting to the database...");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting the database...");
	}
}
