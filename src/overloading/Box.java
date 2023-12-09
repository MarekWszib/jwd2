package overloading;

import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    // te metody buildujące mogłyby być void
    Box buildBox(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }

    Box buildBox(Point topLeft, Point bottomRight) {
        this.x1 = topLeft.x;
        this.y1 = topLeft.y;
        this.x2 = bottomRight.x;
        this.y2 = bottomRight.y;
        return this;
    }

    Box buildBox(Point topLeft, int width, int height) {
        this.x1 = topLeft.x;
        this.y1 = topLeft.y;
        this.x2 = x1 + width;
        this.y2 = y1 + height;  // działamy w czwartej ćwiartce
        return this;
    }

    void printBox() {
        System.out.print("Box: <(" + x1 + "," + y1);
        System.out.println(");(" + x2 + "," + y2 + ")>");
    }

    public static void main(String[] args) {
        Box rect = new Box();

        System.out.println("Tworzymy box ze współrzędnymi (25,25) i (50,50)");
        rect.buildBox(25, 25, 50, 50);
        rect.printBox();

        System.out.println("Tworzymy box z punktami (10,10) i (20,20)");
        Point topLeft = new Point(10, 10);
        Point bottomRight = new Point(20, 20);
        rect.buildBox(topLeft, bottomRight);
        rect.printBox();

        System.out.println("Tworzymy box z punktem (7,9), szerokośćią 50 i wyokością 20");
        rect.buildBox(new Point(7, 9), 50, 20);
        rect.printBox();
    }

}
