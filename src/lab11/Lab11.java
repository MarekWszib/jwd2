package lab11;

//Zaprojektuj hierarchię klas tak, aby:
//
//        klasa C dziedziczyła po klasie B, a klasa B dziedziczyła po klasie A
//        instrukcja new C(); lub new B(); lub new A(); wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas
//        instrukcja new C(true); lub new B(true); lub new A(true); utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów
//        instrukcja new C(false); lub new B(false); lub new A(false); utworzyła konkretny obiekt informując tylko o wywołaniu “pierwszego” konstruktora (konstruktory klas bazowych milczą)

public class Lab11 {
    public static void main(String[] args) {
        new A();
        System.out.println();

        new B();
        System.out.println();

        new C();
        System.out.println();

        System.out.println("------- silent mode = true ---------");

        new A(true);
        System.out.println();

        new B(true);
        System.out.println();

        new C(true);
        System.out.println();

        System.out.println("------- silent mode = false ---------");

        new A(false);
        System.out.println();

        new B(false);
        System.out.println();

        new C(false);
        System.out.println();

    }


}

class A {
    public A() {
        System.out.println("Działa konstruktor A()");
    }

    public A(boolean silentMode) {
        if (!silentMode) {
            System.out.println("Działa konstruktor A(" + silentMode + ")");
        }
    }

}

class B extends A {
    public B() {
        System.out.println("Działa konstruktor B()");
    }

    public B(boolean silentMode) {
        super(true);
        if (!silentMode) {
            System.out.println("Działa konstruktor B(" + silentMode + ")");
        }
    }

}

class C extends B {
    public C() {
        System.out.println("Działa konstruktor C");
    }

    public C(boolean silentMode) {
        super(true);
        if (!silentMode) {
            System.out.println("Działa konstruktor C(" + silentMode + ")");
        }
    }

}
