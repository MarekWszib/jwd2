package laboratoria.lab21;

import java.util.Arrays;
import java.util.Comparator;

//Posortuj tablicę nazw planet układu słonecznego stosując wyrażenie lambda.
// Sortowanie alfabetyczne po ostatniej literze w nazwie planety.
public class PlanetsSortingByLastChar {
    public static void main(String[] args) {
        String[] planets = {"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
//        Arrays.sort(planets, (o1, o2) -> o1.charAt(o1.length()-1) - o2.charAt(o2.length()-1));
        Arrays.sort(planets, Comparator.comparingInt(o -> o.charAt(o.length() - 1)));
        System.out.println(Arrays.toString(planets));
    }

}
