package singleton;

public class A {
    /*
   Singleton design pattern using early instantiation.
     */
    private static A obj=new A();
    private A(){
    }
    public static A getA()
    {

        return obj;
    }
    public void doSomething(){
        System.out.println("Do something is running");
    }
}
