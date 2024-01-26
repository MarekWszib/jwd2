package zadaniadomowe.zadaniedomowe3;

import static zadaniadomowe.zadaniedomowe3.CarUtils.*;

public class CarApp {
    public static void main(String[] args) {
        Car[] motomachi = new Car[5000];
        Car[] tsutsumi = new Car[4500];
        Car[] tahara = new Car[1700];

        fillWithRandomToyotas(motomachi);
        fillWithRandomToyotas(tsutsumi);
        fillWithRandomToyotas(tahara);

        System.out.printf("\nThere are %d silver 2020 Yaris in the Motomachi parking lot.\n", countSilver2020Yaris(motomachi));

        System.out.printf("\nThe most popular car color in the Tsutsumi parking lot is %s.\n", getMostPopularColor(tsutsumi));

        System.out.println("\nThe first 10 cars in the Tahara parking lot:");
        for (int i = 0; i < 10; i++) {
            System.out.println(tahara[i]);
        }
    }
}
