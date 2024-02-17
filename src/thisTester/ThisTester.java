package thisTester;

public class ThisTester {
    public static void main(String[] args) {
        ObjectInformator.show(new String("Ala"));
        new Number(345).showObjectInfo();
    }

}

class ObjectInformator {
    static void show(Object o) {
        System.out.println(o.getClass().getSimpleName());
        System.out.println(o.getClass().getPackage());
        System.out.println(o);
        System.out.println();
    }
}

class Number {
    public int value;

    public Number(int value) {
        this.value = value;
    }

    public void showObjectInfo() {
        ObjectInformator.show(this);
    }

}