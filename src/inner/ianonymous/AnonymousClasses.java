package inner.ianonymous;

public class AnonymousClasses {

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

        jan.saySomething();
        john.saySomething();

    }

}
