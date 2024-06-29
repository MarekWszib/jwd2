package inner.ianonymous;

public class AnonymousDemo2 {

    public static void main(String[] args) {
        AnonymousDemo2 anonymousDemo = new AnonymousDemo2();
        anonymousDemo.someMethod();
    }

    public interface GreetingModule {
        void sayHello();
    }

    public class GreetingModuleImpl implements GreetingModule {
        @Override
        public void sayHello() {
            System.out.println("Good morning 2");
        }
    }

    public void someMethod() {
        GreetingModule greetingModule = new GreetingModuleImpl();
        greetingModule.sayHello();
    }

}
