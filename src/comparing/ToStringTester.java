package comparing;

import java.awt.*;

public class ToStringTester {
    public static void main(String[] args) {
        Integer i = 1;
        System.out.println(i.toString()); // nadmiarowe wywoałanie toString()
        System.out.println(i);

        Point point = new Point(33, 65);
        System.out.println(point);

        Employee employee = new Employee("Krzychu", 35, 12000);
        System.out.println(employee);

    }

}
