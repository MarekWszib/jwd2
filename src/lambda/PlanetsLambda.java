package lambda;

import java.util.Arrays;

public class PlanetsLambda {
    public static void main(String[] args) {
        String[] planets = {"Słońce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};

        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

//        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();
//        Arrays.sort(planets, comparator);

        Arrays.sort(planets, (o1, o2) -> o1.length() - o2.length());
        System.out.println();

//        System.out.println(Arrays.toString(planets));
        Arrays.asList(planets).forEach((p)-> System.out.println(p));
    }

}
