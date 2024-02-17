package laboratoria.lab16;

public class NegativeNumberException extends IllegalArgumentException {
    public NegativeNumberException() {
    }

    public NegativeNumberException(String s) {
        super(s);
    }
}
