package modifiers;

public class Demo {

    public static final int NUMBER = 6;
    static synchronized protected final void specialMethod() {
    }

    public static void main(String[] args) {
        final int number;
        System.out.println("start");
        number = 1;
//        number = 2;
        System.out.println("koniec");
    }
}
