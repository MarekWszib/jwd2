package vars;


public class Demo {
    static void wydrukujPole(int a) {
        System.out.println("Pole kwadratu o boku " + a + " wynosi: " + (a * a) + ".");
    }

    static void wydrukujObwod(int a) {
        System.out.println("Obwód kwadratu o boku " + a + " wynosi: " + (4 * a) + ".");
    }

    static void wydrukujPrzekatna(int a) {
        System.out.println("Dlugosc przekatnej kwadratu o boku " + a + " wynosi: " + Math.sqrt(2 * a * a) + ".");
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
