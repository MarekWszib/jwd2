package zadaniadomowe.zadaniedomomowe2;

import java.math.BigInteger;
import java.util.Locale;

//    Zad3. Załóżmy, że
//        na pierwsze pole szachownicy kładziemy 1 ziarno pszenicy,
//        na drugie 2 ziarna,
//        na trzecie 4 ziarna
//        i na każde następne pole dwa razy więcej ziaren niż na pole poprzednie.
//        Napisz program, który zasymuluje taką sytuację i zliczy sumę wszystkich ziaren na szachownicy.

public class Zad3 {

    public static void main(String[] args) {
        BigInteger[] chessboard = new BigInteger[64];
        fillInChessboard(chessboard);
        BigInteger total = addUpChessboard(chessboard);
        System.out.printf(new Locale("US"), "There are %,d grains on the chessboard.", total);
    }

    private static BigInteger addUpChessboard(BigInteger[] chessboard) {
        BigInteger result = BigInteger.ZERO;
        for (BigInteger d : chessboard) {
            result = result.add(d);
        }
        return result;
    }

    private static void fillInChessboard(BigInteger[] chessboardSquares) {
        chessboardSquares[0] = BigInteger.ONE;
        for (int i = 1; i < chessboardSquares.length; i++) {
            chessboardSquares[i] = chessboardSquares[i - 1].multiply(BigInteger.TWO);
        }
    }

}
