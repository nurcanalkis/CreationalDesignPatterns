package singleton;
public class B {
    private static B obj;
    private B() {
    }
    public static B getB() {
        if (obj == null) {
            System.out.println("ilk kez instance olusturuyor");
            obj = new B();
        }
        else {
            System.out.println("daha once instance olusturulmus");
        }
        return obj;
    }
    public void doSomething() {
        System.out.println("Do something is running");
    }

}
