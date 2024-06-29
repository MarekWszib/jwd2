package laboratoria.lab22;

//Napisz program, który przyjmie listę liczb całkowitych i wykona następujące operacje przy użyciu strumieni:
//filtracja - znajdzie wszystkie liczby parzyste,
//mapowanie - pomnoży każdą liczbę przez 2,
//redukcja - obliczy sumę wszystkich przetworzonych liczb.

import java.util.ArrayList;
import java.util.List;

public class IntegerOperations {
    public static void main(String[] args) {
        List<Integer> ints = provideIntegers();

        Integer result = ints.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }

    private static List<Integer> provideIntegers() {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ints.add(i);
        }
        return ints;
    }

}