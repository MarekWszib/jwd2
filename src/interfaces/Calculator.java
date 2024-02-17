package interfaces;

//interface funkcyjny
@FunctionalInterface //ta adnotacja pilnuje czy ten interface jest rzeycziwscie funkcyjny
public interface Calculator {
    int performOperation(int a, int b); //jedyna abstrakcyjna metoda
    static void sampleStaticMethod(){
        System.out.println("static...");
    }

    default void sampleDefaultMethod(){
        System.out.println("default...");
    }
}