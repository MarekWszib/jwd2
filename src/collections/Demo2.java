package collections;

import modifiers.com.one.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Demo2 {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            numbers.add(i);
//        }

        List<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }



        System.out.println(numbers);
        //kopiowanie z listy do array

//        Integer[] array = new Integer[numbers.size()];
//
//        array = numbers.toArray(array);
//
//        for (Integer number : array) {
//            System.out.println(number);
//        }

//        Integer[] array = numbers.toArray(new Integer[numbers.size()]);


//        List<Integer> allNumbers = new ArrayList<>();
//        allNumbers.addAll(numbers);
//        allNumbers.addAll(numbers);
//        allNumbers.addAll(numbers);
//
//        System.out.println(allNumbers);


        // wstawiamy (zamiana) tam gdzie jest teraz ostatnie wystąpienie "6"

        int index = numbers.lastIndexOf(6);
        numbers.set(index, 99);
        System.out.println(numbers);

    }
}

