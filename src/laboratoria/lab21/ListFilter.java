package laboratoria.lab21;

import java.util.ArrayList;
import java.util.List;

//        Napisz metodę działającą na liście liczb całkowitych.
//        Jej zadaniem będzie wyświetlenie tylko elementów listy podzielnych przez 3.
//        Skorzystaj z metody forEach, wywołanej na obiekcie listy.

public class ListFilter {
    public static void main(String[] args) {
        List<Integer> integers = prepareIntegerList();
        showDivisibleBy3(integers);
    }

    private static void showDivisibleBy3(List<Integer> integers) {
        integers.forEach(x -> {
            if (x % 3 == 0) {
                System.out.println(x);
            }
        });
    }

    private static List<Integer> prepareIntegerList() {
        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(12);
        integers.add(3);
        integers.add(100);
        return integers;
    }
}
