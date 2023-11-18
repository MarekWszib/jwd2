package zadanieDomomowe2;

import java.util.Locale;

//    Zad3. Załóżmy, że
//        na pierwsze pole szachownicy kładziemy 1 ziarno pszenicy,
//        na drugie 2 ziarna,
//        na trzecie 4 ziarna
//        i na każde następne pole dwa razy więcej ziaren niż na pole poprzednie.
//        Napisz program, który zasymuluje taką sytuację i zliczy sumę wszystkich ziaren na szachownicy.
public class Zad3 {

    public static void main(String[] args) {
        double[] chessboard = new double[64];
        fillInChessboard(chessboard);
        double total = addUpChessboard(chessboard);
        System.out.printf(new Locale("US"), "There are a total of %,.0f grains on the board.", total);
    }

    private static double addUpChessboard(double[] chessboard) {
        double result = 0;
        for (double d : chessboard) {
            result += d;
        }
        return result;
    }

    private static void fillInChessboard(double[] chessboardSquares) {
        for (int i = 0; i < chessboardSquares.length; i++) {
            chessboardSquares[i] = Math.pow(2, i);
        }
    }

}
