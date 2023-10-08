package vars;

public class Laboratorium3v2 {
    static void wydrukujPole(int a) {
        System.out.println("Pole kwadratu o boku " + a + " wynosi: " + (a * a) + ".");
    }

    static void wydrukujObwod(int a) {
        System.out.println("Obwód kwadratu o boku " + a + " wynosi: " + (4 * a) + ".");
    }

    static void wydrukujPrzekatna(int a) {
        System.out.println("Dlugość przekątnej kwadratu o boku " + a + " wynosi: " + (a * Math.sqrt(2)) + ".");
    }

    static void wydrukujDaneKwadratu(int a) {
        wydrukujPole(a);
        wydrukujObwod(a);
        wydrukujPrzekatna(a);
    }

    public static void main(String[] args) {
        wydrukujDaneKwadratu(2);
        wydrukujDaneKwadratu(7);
        wydrukujDaneKwadratu(11);
        wydrukujDaneKwadratu(19);
    }

}
