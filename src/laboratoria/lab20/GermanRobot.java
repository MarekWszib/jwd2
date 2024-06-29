package laboratoria.lab20;

public class GermanRobot {

    public interface GreetingModule {
        void sayHello();
    }

    public static class Robot {
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething(){
            greetingModule.sayHello();
        }
    }

    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("dzień dobry");
            }
        });

        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        });

        Robot jurgen = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Guten Morgen");
            }
        });

        jan.saySomething();
        john.saySomething();
        jurgen.saySomething();

    }

}
