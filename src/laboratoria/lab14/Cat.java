package laboratoria.lab14;

public class Cat extends Animal {
    private static int instanceNumber;

    public Cat() {
        instanceNumber++;
    }

    @Override
    String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    int getInstanceNumber() {
        return instanceNumber;
    }
}
