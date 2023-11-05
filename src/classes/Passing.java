package classes;

import java.awt.*;

public class Passing {
    public static void main(String[] args) {
        int i = 10;

        System.out.println("Przed zmianą:" + i);
        changeIt(i);
        System.out.println("Po zmianie: "+ i);

        Point p = new Point(1, 1);
        System.out.println("Przed: " + p);
        changeIt(p);
        System.out.println("Po: " + p);

    }

    static void changeIt(Point p) { // nie zmieni
        p = new Point(4,4);
        System.out.println("Zmieniam to na co wskzauje p.");
        p.x++;
        p.y++;
    }

    static void changeIt2(Point p) { // zmieni
        System.out.println("Zmieniam to na co wskzauje p.");
        p.x++;
        p.y++;
    }

    static void changeIt(int i) {
        System.out.println("Zmieniam i:");
        i++;
    }

}
