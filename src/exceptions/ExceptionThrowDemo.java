package exceptions;

public class ExceptionThrowDemo { //porównaj w zmateriałami prowadzącego!!!
    public static void main(String[] args) {
        ExceptionThrowDemo etd = new ExceptionThrowDemo();
        int hours = 3;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = etd.getNumberOfSeconds(-2);
        } catch (IllegalArgumentException e) {
            System.out.println("Nastąpiła korekta hours");
            numberOfSeconds = etd.getNumberOfSeconds(hours * -1);
        }

    }

    public int getNumberOfSeconds(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Liczba godzin nie może być ujemna: " + hours + ".");
        }
        return hours * 60 * 60;
    }


}
