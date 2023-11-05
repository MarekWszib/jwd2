package lab7;

public class Lab7zad1 {
    public static void main(String[] args) {
//        int n = 4;
//        System.out.println("n = " + n + " matrix");
//        System.out.println("---------------");
//        for (int i = 1; i <= n; i++) {
//            for (int number = i, counter = 0; counter < n; number++, counter++) {
//                System.out.printf("%d\t", number);
//            }
//            System.out.println();
//        }


        int n = 8;
        System.out.println("n = " + n + " matrix");
        for (int i = 0; i < 3*n; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3s", i + j + " ");
            }
            System.out.println();
        }
    }


}

