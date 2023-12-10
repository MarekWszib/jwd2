package laboratoria.lab10;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res1 = calc.add(1, 2);
        int res2 = calc.add(1, 2, 4);
        double res3 = calc.add(1d, 2d);
        double res4 = calc.add(1d, 2d, 4d);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b, double c) {
//        return a + b + c;
        return add(a,b) + c;
    }

    double add(double a, double b) {
        return a + b;
    }

}
