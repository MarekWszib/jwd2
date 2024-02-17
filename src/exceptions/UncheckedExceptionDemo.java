package exceptions;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        UncheckedExceptionDemo ued = new UncheckedExceptionDemo();
        int i = ued.getNumberFromString("s1");
        System.out.println("Oto nasza liczba pomnożona przez 99: " + (i * 99));
    }

//    public int getNumberFromString(String string) {
//        return Integer.parseInt(string);
//    }

    public int getNumberFromString(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
        return -1; //nieeleganckie...
    }

}
