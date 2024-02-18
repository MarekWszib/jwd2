package laboratoria.lab17;

public class ComputationTester {
    public static void main(String[] args) {
        double x = 5;
        double y = -2;
        System.out.println("ADD: " + Computation.ADD.perform(x, y));
        System.out.println("SUBTRACT: " + Computation.SUBTRACT.perform(x, y));
        System.out.println("MULTIPLY: " + Computation.MULTIPLY.perform(x, y));
        System.out.println("DIVIDE: " + Computation.DIVIDE.perform(x, y));
    }
}
