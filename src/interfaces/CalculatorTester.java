package interfaces;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator adder = new Calculator() {
            @Override
            public int performOperation(int a, int b) {
                return a + b;
            }
        };

        System.out.println(adder.performOperation(4,5));

        Calculator multiplier = (a, b) -> a * b; // wykorzystanie wyrażenia LAMBDA

        System.out.println(multiplier.performOperation(3,9));


    }

}
