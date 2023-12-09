package constructors;

public class Demo {


//    public Demo(String message) {
//        System.out.println(message);
//    }
//
//    public Demo() { // dodany bo był niedostępny po dodaniu konstruktora powyżej
//    }
//
//    public static void main(String[] args) {
//        Demo demo = new Demo();
//        new Demo("hohohoh");
//    }


    public static void main(String[] args) {
        new A();
        System.out.println();
        new B("hello");
    }

}

class A {
    public A() {
//        super(); // wywołanie konstruktora z klasy nadrzędnej, TA AKCJA JEST WYWOŁYWANA DOMYŚLNIE
        System.out.println("działa konstruktor A()");
    }

    public A(String param) {
//        super(); // wywołanie konstruktora z klasy nadrzędnej, TA AKCJA JEST WYWOŁYWANA DOMYŚLNIE
        System.out.println("działa konstruktor A() z parametrem(" + param + ")");
    }

}

class B extends A {
    public B() {
//        super();
        System.out.println("działa konstruktor B()");
    }


    public B(String param) {
        super(param);
        System.out.println("działa konstruktor B() z parametrem(" + param + ")");
    }
}
