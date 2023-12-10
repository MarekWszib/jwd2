package laboratoria.lab14;

public class Dog extends Animal {
    private static int instanceNumber;

    public Dog() {
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