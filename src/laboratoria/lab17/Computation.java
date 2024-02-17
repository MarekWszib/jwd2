package laboratoria.lab17;

public enum Computation {
    MULTIPLY {
        @Override
        public double perform(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public double perform(double a, double b) {
//            if (b == 0d) {
//                throw new IllegalArgumentException("próba dzielenia przez 0");
//            }
            return a / b;
        }
    },
    ADD {
        @Override
        public double perform(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public double perform(double a, double b) {
            return a - b;
        }
    };

    public abstract double perform(double a, double b);


    public static void main(String[] args) {
        System.out.println(Computation.ADD.perform(1, -5));
        System.out.println(Computation.DIVIDE.perform(1, -5));
        System.out.println(Computation.DIVIDE.perform(1, 0));
    }
}
