package laboratoria.lab8;

// Napisz program, który znajdzie najczęściej występującą CYFRĘ w tablicy.
// Przykłady:
//          wejście:    4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3
//          rezultat:   4 (5 razy)

public class Lab8zad1 {
    public static void main(String[] args) {
        int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int[] counters = new int[10]; // ten size można podbić do max z array, zeby miec ogolne rozwiazanie

        for (int i : array) {
            counters[i]++;
        }

        int mostFrequent = 0;

        for (int i = 1; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
            }
        }

        System.out.println(mostFrequent + " (" + counters[mostFrequent] + " razy)");
    }

}