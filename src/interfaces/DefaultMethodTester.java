package interfaces;

public class DefaultMethodTester implements MyInterface {
    @Override
    public void method() {
        System.out.println("wywołanie metody zaimplementowanej w DefaultMethodTester");
    }

    @Override
    public String method2() {
        return "xyz";
    }

    public static void main(String[] args) {
        DefaultMethodTester defaultMethodTester = new DefaultMethodTester();
        defaultMethodTester.method();
        defaultMethodTester.defaultMethod();
        MyInterface.staticMethod(); // nie da się dostać do tej metody statycznej w kontekscie obiektu!
    }
}

interface MyInterface {
    void method();

    default void defaultMethod() {
        System.out.println("wywołanie metody domyslnej");
    }

    String method2();

    default void defaultMethod2() {
        System.out.println("wywołanie metody domyslnej" + method2());
    }

    static void staticMethod() {
        System.out.println("wywołanie metody statycznej");
    }

    private int sum(int a, int b) {
        return a + b;
    }

    default void defaultMethodUsingPrivateMethod() {
        System.out.println("wywołanie metody domyslnej korzystające z metody prywatnej" + sum(1, 4));
    }

}
