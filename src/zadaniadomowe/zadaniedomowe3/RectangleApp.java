package zadaniadomowe.zadaniedomowe3;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[]{
                new Rectangle(),
                new Rectangle(10, 4),
                new Rectangle(5)
        };

        for (Rectangle rectangle : rectangles) {
            System.out.println("The area of the " + rectangle + " is " + rectangle.getArea() + ".");
        }
    }
}
