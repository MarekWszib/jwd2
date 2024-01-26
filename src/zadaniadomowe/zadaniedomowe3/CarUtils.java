package zadaniadomowe.zadaniedomowe3;

import java.util.Random;

public class CarUtils {
    private static String[] models = new String[]{"Yaris", "Corolla", "Aygo"};
    private static String[] colors = new String[]{"silver", "blue", "black"};
    private static int[] years = new int[]{2018, 2019, 2020};
    private static Random random = new Random();

    public static void fillWithRandomToyotas(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(
                    models[random.nextInt(models.length)],
                    colors[random.nextInt(colors.length)],
                    years[random.nextInt(years.length)]);
        }
    }

    public static int countSilver2020Yaris(Car[] cars) {
        int result = 0;
        Car silverYaris2020 = new Car("Yaris", "silver", 2020);

        for (Car car : cars) {
            if (silverYaris2020.equals(car)) {
                result++;
            }
        }

        return result;
    }

    public static String getMostPopularColor(Car[] cars) {
        int maxCount = 0;
        String mostPopularColor = null;

        for (String color : colors) {
            int count = 0;
            for (Car car : cars) {
                if (color.equals(car.getColor())) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostPopularColor = color;
            }
        }

        return mostPopularColor;
    }

//    --------- returning List<String>, using Map<String,Integer>: -----------
//
//    public static List<String> getMostPopularColor(Car[] cars) {
//        HashMap<String, Integer> numberOfOccurrencesByColors = new HashMap<>();
//        for (Car car : cars) {
//            numberOfOccurrencesByColors.merge(car.getColor(), 1, Integer::sum);
//        }
//        Integer maxNumberOfOccurrences = Collections.max(numberOfOccurrencesByColors.values());
//        return numberOfOccurrencesByColors.entrySet().stream()
//                .filter(es -> maxNumberOfOccurrences.equals(es.getValue()))
//                .map(Map.Entry::getKey)
//                .toList();
//    }

}
