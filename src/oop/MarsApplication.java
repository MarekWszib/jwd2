package oop;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttributes();

        System.out.println("Zwiększamy prędkość do 3");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("zmiana teperatury na -90");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("sprawdzenie temperratury");
        spirit.checkTemperature();
        spirit.showAttributes();

        MarsRobot opportunity = new MarsRobot();

        opportunity.status = "śpi";
        opportunity.speed = 0;
        opportunity.temperature = 36;
        opportunity.showAttributes();

        spirit.checkStatus();
        opportunity.checkStatus();
    }
}
