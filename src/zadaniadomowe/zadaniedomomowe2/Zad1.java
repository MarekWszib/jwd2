package zadaniadomowe.zadaniedomomowe2;

//      Napisz program, który:
//        stworzy tablicę liczb typu int o rozmiarze, który będziemy podawać jako argument przy starcie programu,
//        wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
//        wyświetli zawartość tablicy,
//        dokona konwersji tablicy tak, aby elementy ułożyły się odwrotnie (ciąg malejący: n, n-1, n-2… 1),
//        wyświetli zawartyość przekonwertowanej tablicy,
//        fragmenty programu odpowiadjące za konkretne zadania zostaną wyodrębnione jako oddzielne metody.

import java.util.Arrays;

public class Zad1 {

    public static void main(String[] args) {
        int arraySize = Integer.parseInt(args[0]);
        int[] ints = createArray(arraySize);
        fillInArray(ints);
        printArray(ints);
        convertArray(ints);
        printArray(ints);
    }

    private static void convertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tempI = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tempI;
        }
    }

    private static void printArray(int[] ints) {
        System.out.println(Arrays.toString(ints));
    }

    private static void fillInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    private static int[] createArray(int size) {
        return new int[size];
    }

}
