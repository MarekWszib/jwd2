package kolokwium2;

//Napisz program, który:
//
//        stworzy tablicę liczb typu int o rozmiarze, który będziemy podawać jako argument przy starcie programu,
//        wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
//        wyświetli zawartość tablicy.
//        Przykład:
//        ArrayFiller 5
//        1 2 3 4 5
public class ArrayFiller {
    public static void main(String[] args) {
        int arrLength = Integer.parseInt(args[0]);
        int[] ints = new int[arrLength];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}