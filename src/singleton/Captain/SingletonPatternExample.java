package singleton.Captain;

public class SingletonPatternExample {
	public static void main(String[] args) {
		System.out.println("***Singleton Pattern Demo***\n");		
		System.out.println("Trying to make a captain for your team:");
		//Constructor is private.We cannot use "new" here.
		//MakeACaptain c3 = new MakeACaptain();//error
		MakeACaptain c1 = MakeACaptain.getCaptain();		
		System.out.println("Trying to make another captain for your team:");
		MakeACaptain c2 = MakeACaptain.getCaptain();
			if (c1 == c2) 
			{ 
				System.out.println("c1 and c2 are same instance."); 
			}
			//MakeACaptain.MakeACaptainDerived derived=c1.new MakeACaptainDerived();			
	}
}