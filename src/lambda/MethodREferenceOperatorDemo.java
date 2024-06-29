package lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodREferenceOperatorDemo {
    public static void main(String[] args) {
//        Function<String, Integer> func = s -> Integer.parseInt(s);
        Function<String, Integer> func = Integer::parseInt;
        int number = func.apply("324");

//        Consumer<String> printer = s -> System.out.println(s);
        Consumer<String> printer = System.out::println;
        printer.accept("Heyyyyy");

    }
}
