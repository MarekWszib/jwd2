package lab8;

import java.util.Arrays;

public class Lab8zad1 {
    public static void main(String[] args) {

//        int[] numbers = {2, 3, 2, 1, 4, 4, 5, 4};
//        int[] counts = new int[numbers.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            int count = 0;
//            for (int j = 0; j < numbers.length; j++) {
//                if (numbers[j] == numbers[i]) {
//                    count++;
//                }
//            }
//            counts[i] = count;
//        }
//
//        int maxCount = Arrays.stream(counts).max().getAsInt();
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (counts[i] == maxCount) {
//                System.out.println(numbers[i] + " (" + counts[i] + " razy)");
//                break;
//            }
//        }

        int[] arr = {3, 4, 5, 6, 6, 6, 6, 7, 8, 6, 9, 0, 5, 6, 3,3,3,3,3,3,3,3,3};
        int[] counters = new int[10]; // ten size można podbić do max z array, zeby miec ogolne rozwiazanie

        for (int i = 0; i < arr.length; i++) { // mógłby być for each
            counters[arr[i]]++;
        }

        int mostFrequent = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
            }
        }

        System.out.println("Najczęściej występującą cyfrą jest: " + mostFrequent + " (" +counters[mostFrequent]+" razy)");


    }
}
