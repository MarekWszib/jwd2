package laboratoria.lab16;

//Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
//        Do obliczenia pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt().
//        Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException.
//        Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.

import java.util.Scanner;

public class SqrtCalculator {

    // dobra wersja
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0;


        try {
            d = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Błąd! Podana wartość nie jest liczbą!");
            System.exit(-1);
        }

        if (d < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println(Math.sqrt(d));

    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Double userInput = 0d;
//        System.out.println("Podaj liczbę:");
//
//        try {
//            userInput = scanner.nextDouble();
//        } catch (Exception e) {
//            System.out.println("Podano ciąg znaków, który nie jest liczbą!");
//            System.exit(-1);
//        }
//
//        if (userInput < 0) {
//            throw new IllegalArgumentException("Podano liczbę ujemną: " + userInput);
//        }
//
//
//        System.out.println("Pierwiastek z " + userInput + " wynosi: " + Math.sqrt(userInput));
//
//
//    }

}
