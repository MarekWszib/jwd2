package lab7;

import java.util.Scanner;

public class Lab7zad2 {
    public static void main(String[] args) {
//        System.out.print("enter a number binary: ");
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//
//        int length = string.length();
//        double result = 0;
//
//        for (int i = 0; i <length ; i++) {
//            Double bit = Double.valueOf(string.substring(i,i+1));
//            double powerOfTwo = Math.pow(2, length - 1 - i);
//            result = result + powerOfTwo * bit;
//        }
//
//        System.out.println("nember = " + (long) result);


        String binary = "1101";
        Long result = 0L;

        // 1 1 0 1
        // 0 1 2 3 - indeks (i)
        // 3 2 1 0 - indeks odwórocny (długość - i - 1)

        for (int i = 0; i < binary.length(); i++) {
            int reversedIndex = binary.length() - 1 - i;
            char c = binary.charAt(reversedIndex);
            int bit = Character.getNumericValue(c);

            result += bit * (int) Math.pow(2, i);
        }
        System.out.println("binarnie " + binary + " to " + result + ".");

    }
}
