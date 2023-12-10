package laboratoria.lab14;

public class Rat extends Animal {
    private static int instanceNumber;

    public Rat() {
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
