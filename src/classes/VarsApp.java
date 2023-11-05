package classes;

public class VarsApp {
    public static void main(String[] args) {
        int i = 77;
        Vars v1 = new Vars(); // to także zmienna lokalna
        v1.i = 9;

        System.out.println("Wyświetlamy zmienną egzemlarza i dla v1: " + v1.i);

    }

}
