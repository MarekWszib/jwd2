package zadaniadomowe.zadaniedomomowe2;

//  Napisz program wyświetlający świąteczną choinkę składającą się z losowych elementów
//  następującego zbioru znaków ASCII: ‘+’, ‘.’, ‘*’, ‘~’, ‘^’, ‘o’.
//  Wysokość choinki powinna być podawana jako argument programu.
//  Jeżeli wysokość nie zostanie określona to powinna zostać przyjęta domyślna wartość 18.

import java.util.Random;

public class Zad2 {

    public static void main(String[] args) {
        int treeSize = args.length == 0 ? 18 : Integer.parseInt(args[0]);
        char[] chars = {'+', '.', '*', '~', '^', 'o'};
        Random randomIndex = new Random();

        for (int i = 1; i <= treeSize; i++) {
            for (int j = 0; j < treeSize - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(chars[randomIndex.nextInt(chars.length)]);
            }
            if (i < treeSize) {
                System.out.println();
            }
        }
    }

}