package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(123);
//        numbers.add(3);
//        numbers.add(44);
//
//        System.out.println(numbers);
//        System.out.println(numbers.size());
//        System.out.println(numbers.get(0));
//        numbers.remove(0);
//        System.out.println(numbers);
//        System.out.println(numbers.get(0));
//
//        numbers.remove((Integer) 3); // usunięcie pierwszego wystąpienia liczby 3 (a nie obiektu o ideksie 3
//
//        numbers.clear(); // wyczyszczenie tablicy

//        List<String> names = new ArrayList<>();
//        names.add("Staszek");
//        names.add("Wiola");
//        names.add("Kasia");
//        names.add("Marta");
//
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(i + " - " + names.get(i));
//        }

//        ArrayList list = new ArrayList<>();
//        list.add(1);
//        list.add(new Object());
//        list.add("Ala");
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//
//        System.out.println(list.get(0) + list.get(1)); // nmiewykonalne
//        System.out.println((int) list.get(0) + (String) list.get(1));


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(67);
        numbers.add(67);
        numbers.add(56);
//
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println("Liczba: " + numbers.get(i));
//        }
//        System.out.println();
//
//        for (Integer number : numbers) { // tu też będzie zawsze zachowana kolejność
//            System.out.println("Liczba: " + number);
//        }
//        System.out.println();

        // ITERATOR !!!!
//        Iterator<Integer> iterator = numbers.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println("Liczba " + iterator.next());
//        }

        ListIterator listIterator = numbers.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) { // ten iterator jest bardziej wypasiony - możę się COFAĆ

            System.out.println("indeks " + listIterator.previousIndex() + ": " + listIterator.previous());
        }




    }
}

