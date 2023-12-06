package lab9;

//Napisz program, który oblicza pierwiastek kwadratowy
//        z liczby podanej jako argument programu.
//        Uruchom program z wiersza poleceń.
public class SquareRootApp {
    public static void main(String[] args) {
        double number = Double.parseDouble(args[0]);
        System.out.println(Math.sqrt(number));
    }
}
