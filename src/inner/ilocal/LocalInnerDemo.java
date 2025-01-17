package inner.ilocal;

import java.util.Arrays;

public class LocalInnerDemo {
    public static void main(String[] args) {
        Outer.localClassInstantiate(args);
    }
}

class Outer {
    public static void localClassInstantiate(String[] args) {
        // klasa lokalna (w metodzie)
        class LocalClass {
            public String toString() {
                return "Argumenty metody: " + Arrays.toString(args);
            }
        }

        LocalClass localClass = new LocalClass();
        System.out.println(localClass);

    }
};
