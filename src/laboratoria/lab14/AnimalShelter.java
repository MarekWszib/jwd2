package laboratoria.lab14;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int choice = random.nextInt(3);

            switch (choice) {
                case 0:
                    animals[i] = new Cat();
                    break;
                case 1:
                    animals[i] = new Dog();
                    break;
                case 2:
                    animals[i] = new Rat();
            }
        }

        String animal33type = animals[32].getType();
        int animal33overallNumber = animals[32].getInstanceNumber();

        System.out.printf("W 33 kojcu jest zwierzę klasy %s.\n", animal33type);
        System.out.printf("Łączna liczba zwierząt klasy %s to %d.", animal33type, animal33overallNumber);
    }
}
