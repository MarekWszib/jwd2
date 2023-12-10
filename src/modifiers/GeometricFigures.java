package modifiers;

import java.sql.SQLOutput;

public class GeometricFigures {
    public static void main(String[] args) {
//        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(2, 5);
        Triangle triangle = new Triangle(4, 2);

        System.out.print("Prostokąt - ");
        showArea(rectangle);
        System.out.print("Trójkąt - ");
        showArea(triangle);

        Shape[] shapes = {rectangle, triangle};
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());

        }
    }

    public static void showArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }
}
