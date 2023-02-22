package singleton.Captain;

final class MakeACaptain
{
	private static MakeACaptain captain; 
	//We make the constructor private to prevent the use of "new"
	static int numberOfInstance=0;
	private MakeACaptain() { 
		numberOfInstance++;
		System.out.println("Number of instances at this moment="+ numberOfInstance);
		}	

   public static synchronized MakeACaptain getCaptain()
   //public static  MakeACaptain getCaptain()
    { 
	        
	    	 // Lazy initialization
	    	 if (captain == null) 
	    	 { 
	    		 captain = new MakeACaptain();	    	 
	    	    System.out.println("New captain is elected for your team."); 
	    	 } 
	    	 else
	    	 { 
	    		 System.out.print("You already have a captain for your team.");
	    		 System.out.println("Send him for the toss.");
	         } 
	    	 return captain;	    	 
	  }
  /* //A non-static nested class (inner class)
   public class MakeACaptainDerived extends MakeACaptain
   {
   
   }*/
}