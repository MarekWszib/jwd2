package exceptions;

public class ExceptionTester {
    public static void main(String[] args) {
        int[] numbers = {5, 55, 555};

//        try {
//            System.out.println(numbers[1]);
//        } catch (Exception e) {
//            System.out.println("Coś poszło nie tak! " + e.getMessage());
//        }
//
//        try {
//            System.out.println(numbers[10]);
//        } catch (Exception e) {
//            System.out.println("Coś poszło nie tak! " + e.getMessage());
//        }

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nie ma takiego indeksu! " + e.getMessage());
        } catch (Exception e){
            System.out.println("Coś poszło nie tak: " + e.getMessage());
        } finally {
            System.out.println("koniec");
        }

    }
}
