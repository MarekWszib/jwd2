package classes;

public class Vars {
    int i; // zmienna egzemplarza (pole klasy)
    static int j = 45; // zmienna klasowa (pole statyczne)

    public int change() {
        int k = 7; // zmienna lokalna, NIE MA AUTO INICJALIZACJI
        return i + k + j;
    }

    public static void main(String[] args) {
        int i = 77;
        Vars v1 = new Vars(); // to także zmienna lokalna
        v1.i = 9;
        System.out.println("Wyświetlamy zmienną egzemlarza i dla v1: " + v1.i);

        Vars v2 = new Vars();
        v2.i = 5;
        System.out.println("Wyświetlamy zmienną egzemlarza i dla v1: " + v2.i);

        System.out.println("Wyświetlamy zmienną klasową j: " + Vars.j);

        System.out.println("Wyświetlamy zmienną lokalną i: " + i);

    }


}
