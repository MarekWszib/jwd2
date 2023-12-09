package overloading;

//overloading
public class Adder {
    public static void main(String[] args) {
        System.out.println("suma dwóch liczb = " + sum(5, 3));
        System.out.println("suma trzech liczb = " + sum(5, 3, 10));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }


}
