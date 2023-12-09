package constructors;

public class MarsRobot {

    String status;
    int speed;
    int power;

    MarsRobot(String status, int speed, int power) {
        this.status = status;
        this.speed = speed;
        this.power = power;
    }

    public static void main(String[] args) {
        MarsRobot marsRobot1 = new MarsRobot("working", 5, 10);
        MarsRobot marsRobot2 = new MarsRobot("powrót do bazy", 20, 3);

        System.out.println(marsRobot1.status);
        System.out.println(marsRobot2.status);

    }

}
