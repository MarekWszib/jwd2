package overriding;

public class Printer {
    int x = 0;
    int y = 0;

    void printMe() {
        System.out.println("x=" + this.x + ", y=" + this.y);
        System.out.println("Jestem egzemplarzem kalsy " + this.getClass().getSimpleName());
    }
}
