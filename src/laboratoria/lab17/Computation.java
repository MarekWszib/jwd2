package laboratoria.lab17;

public enum Computation {
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
    },
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
    };

    abstract public double perform(double a, double b);
}
