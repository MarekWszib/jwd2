package objects;

import java.awt.*;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
//        Object object = new Object();
//        String name = new String("Ala");
//        Point point = new Point();
//
//        System.out.println(Math.max(10,44));
//
//        String s1, s2;
//        s1 = String.valueOf(550);
//        System.out.println(s1);

//        int accountBalance = 15005;
//        System.out.printf("Saldo: %,d zł%n", accountBalance);
//        System.out.printf(new Locale("us"), "Saldo: $ %,d %n", accountBalance);

        // s - strings
        // d - decimals, integers
        // f - floating points
        // t - date / time
        // n - new line
        // bB - boolean

//        double pi = Math.PI;
//        double p2 = 12345.6789;
//        System.out.println(pi);
//        System.out.printf("%.4f%n",pi);
//        System.out.printf("%.4f%n",p2);

//        byte a = 7;
//        short b;
//        int c;
//
//        c = a; //konwersja niejawna
//        b = (short) c; // konwersja jawna, czyli rzutowanie

//        int a = 5;
//        double b = 13.5;
//        double c = b / a; // konwersja niejawna
//        System.out.println(c); // -> 2.7
//
//        int d = (int) (b / a);
//        System.out.println(d);

//        Float f1 = 12.5F;
//        Float f2 = 27.2F;
//
//        System.out.println("Mniejsza z liczb" + Math.min(f1,f2)); // nastąpił unboxing: Float -> float


        String s = "ooo";
        System.out.println(s.getClass().getName());

        System.out.println("" + s instanceof String);


    }
}
