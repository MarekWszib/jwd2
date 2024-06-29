package laboratoria.lab20;

public class A {
    int fieldA;

    public A(int fieldA) {
        this.fieldA = fieldA;
    }

    public int getFieldA() {
        return fieldA;
    }

    public class B {
        int fieldB;

        public B(int fieldB) {
            this.fieldB = fieldB;
        }

        public int getFieldB() {
            return fieldB;
        }

        public class C {
            int fieldC;

            public C(int fieldC) {
                this.fieldC = fieldC;
            }

            public int getFieldC() {
                return fieldC;
            }

            public class D {
                public D(int fieldD) {
                    this.fieldD = fieldD;
                }

                int fieldD;

                public int getFieldD() {
                    return fieldD;
                }
            }

        }

    }

    public static void main(String[] args) {
        A a = new A(1);
        B b = a.new B(2);
        B.C c = b.new C(3);
        B.C.D d = c.new D(4);

        System.out.println(a.getClass() + ": field = " + a.getFieldA());
        System.out.println(b.getClass() + ": field = " + b.getFieldB());
        System.out.println(c.getClass() + ": field = " + c.getFieldC());
        System.out.println(d.getClass() + ": field = " + d.getFieldD());
    }

}
