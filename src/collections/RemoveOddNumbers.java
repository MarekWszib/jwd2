package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(27);

        System.out.println(numbers);

//        for (Integer i : numbers) { // nie zadziałą, poleci wyjątek
//            if(i % 2 != 0) {
//                numbers.remove(i)
//            }
//        }

//        for (int k = 0; k < numbers.size(); k++) { // nie leci wyjątek, ale wynik jest NIEPOPRAWNY
//            Integer i = numbers.get(k);
//            if (i % 2 != 0) {
//                numbers.remove(i);
//            }
//        }


        Iterator<Integer> iterator = numbers.iterator(); // PRAWIDLOWE ROZWIAZANIE
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);

    }
}
