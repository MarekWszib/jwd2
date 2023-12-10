package laboratoria.lab7;

import java.util.Scanner;

//        Napisz program, który:
//        konwertuje binarną liczbę całkowitą na postać dziesiętną,
//        dane wejściowe są wprowadzane jako ciąg znaków,
//        wynik powinien być zmienną typu long,
//        nie korzystaj z gotowych rozwiązań.

public class Lab7zad2 {
    public static void main(String[] args) {
        System.out.print("Please enter a binary number: ");
        Scanner scanner = new Scanner(System.in);
        String binaryNumberString = scanner.nextLine();
        long decimalNumber = 0;

        int binaryNumberLength = binaryNumberString.length();
        for (int i = 0; i < binaryNumberLength; i++) {
            byte bit = (byte) Character.getNumericValue(binaryNumberString.charAt(i));
            long powerOfTwo = (int) Math.pow(2, binaryNumberLength - 1 - i);
            decimalNumber += bit * powerOfTwo;
        }
        System.out.printf("The binary number %s is equal to %d.", binaryNumberString, decimalNumber);

//        String binary = "1101";
//        Long result = 0L;
//
//        // 1 1 0 1
//        // 0 1 2 3 - indeks (i)
//        // 3 2 1 0 - indeks odwórocny (długość - i - 1)
//
//        for (int i = 0; i < binary.length(); i++) {
//            int reversedIndex = binary.length() - 1 - i;
//            char c = binary.charAt(reversedIndex);
//            int bit = Character.getNumericValue(c);
//
//            result += bit * (int) Math.pow(2, i);
//        }
//        System.out.println("binarnie " + binary + " to " + result + ".");

    }
}