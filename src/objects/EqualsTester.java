package objects;

import java.sql.SQLOutput;

public class EqualsTester {
    public static void main(String[] args) {
        String str1, str2;
        str1 = " Ale to się rozrasta.";

        str2 = str1;

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("ten sam obiekt? " + (str1 == str2));
        System.out.println("taki sam obiekt? " + (str1.equals(str2)));

        str2 = new String(str1);
        System.out.println("\nstr1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("ten sam obiekt? " + (str1 == str2));

        System.out.println("taki sam obiekt? " + (str1.equals(str2)));


    }
}
