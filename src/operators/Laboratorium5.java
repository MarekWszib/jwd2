package operators;

public class Laboratorium5 {
    public static void main(String[] args) {
        // Zadanie 1:
        double wartoscPoczatkowa = 14_000;
        double wartoscKoncowa = (wartoscPoczatkowa * 1.4 - 1500) * 1.12;
        System.out.println("Wartość końcowa = " + wartoscKoncowa);

        // Zadanie 2:
        int number = 50;
        boolean jestPodzielnaPrzez7i5 = number % 5 == 0 && number % 7 == 0;
        System.out.println("Liczba " + number + (jestPodzielnaPrzez7i5 ? " jest " : " nie jest ") + "jednocześnie podzielna przez 7 i 5.");

        // Zadanie 3:
        int a = 0b11001;
        int b = 0b11101;
        int c = 0b00011;
        int wynik = a & b ^ c;

        System.out.println("W systemie binarnym wynik działania: "
                + Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " ^ " + Integer.toBinaryString(c) +
                " to " + Integer.toBinaryString(wynik));
    }
}
