package collections;

//utworz listę 100 elementów
//wyswietl liste
//usun co trzeci element
//wyswietl liste

import java.util.*;

public class ZadanieRemove {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(100); // w celu optymalizacji podalismy initialCapacity
        for (int i = 0; i < 100; i++) {
            numbers.add(i, i + 1);
        }

        System.out.println(numbers);

//        Iterator<Integer> iterator = numbers.iterator();
//
//        while (iterator.hasNext()) {
//            Integer i = iterator.next();
//            if (i % 3 == 0) { //usuwa na podstawie lelementu a nie jego indeksu
//                iterator.remove();
//            }
//        }
//
//        System.out.println(numbers);
//    }

        numbers.removeIf(e -> e % 3 == 0); // to jest to samo co powyzej

    }
}
