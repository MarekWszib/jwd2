package laboratoria.lab20;

//Napisz potrójnie zagnieżdżoną klasę:
//każda z klas powinna posiadać atrybut typu int,
//utwórz instancję każdej z klas,
//wyświetl wartość atrybutu każdej instancji.

public class A {
    int att;
    public A(int att) {
        this.att = att;
    }
    public int getAtt() {
        return att;
    }

    public class B {
        int att;
        public B(int att) {
            this.att = att;
        }
        public int getAtt() {
            return att;
        }

        public class C {
            int att;
            public C(int att) {
                this.att = att;
            }
            public int getAtt() {
                return att;
            }

            public class D {
                int att;
                public D(int att) {
                    this.att = att;
                }
                public int getAtt() {
                    return att;
                }
            }
        }
    }

    public static void main(String[] args) {
        A a = new A(1);
        B b = a.new B(2);
        B.C c = b.new C(3);
        B.C.D d = c.new D(4);

        System.out.println(a.getClass() + ": att = " + a.getAtt());
        System.out.println(b.getClass() + ": att = " + b.getAtt());
        System.out.println(c.getClass() + ": att = " + c.getAtt());
        System.out.println(d.getClass() + ": att = " + d.getAtt());
    }
}