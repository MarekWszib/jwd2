package laboratoria.lab10;

public class Boy extends Human {
    @Override
    void eat() {
        System.out.println("Boy is eating...");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.eat();

        Boy boy = new Boy();
        boy.eat();
    }
}
