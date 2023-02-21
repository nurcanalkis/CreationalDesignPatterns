package singleton;
public class B {
    private static B obj;
    private B() {
    }
    public static B getB() {
        if (obj == null) {
            System.out.println("instance is created for the first time");
            obj = new B();
        }
        else {
            System.out.println("instance has been created before");
        }
        return obj;
    }
    public void doSomething() {
        System.out.println("Do something is running");
    }

}
