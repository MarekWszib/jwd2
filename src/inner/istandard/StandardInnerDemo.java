package inner.istandard;

public class StandardInnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner1 = outer.instantiate();

        // bez metody instantiate
        Outer.Inner inner2 = outer.new Inner(); // zapis prawidłowy, ale "kłuje w oczy"

    }
}

class Outer {
    class Inner {
    }

    public Inner instantiate() {
        return new Inner();
    }
}