package lambda;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MyFirstLambda {
    public static void main(String[] args) {
        Multiplier multiplier = x -> x*x;
        System.out.println(multiplier.perform(7));
        System.out.println(multiplier.perform(5));
        System.out.println(multiplier.perform(10));
        System.out.println();

        Introducer introducer = s -> System.out.println("Jestem " + s + ".");
        introducer.run("Kasia");
        introducer.run("Bolek");
        System.out.println();

        // skorzystamy z gotowych inerfejsów funkcyjnych:
        UnaryOperator<Integer> uo = x -> 5*x;
        System.out.println(uo.apply(9));
        System.out.println();

        Consumer<String> consumer = s -> System.out.println("Jołłł, jestem " + s + ".");
        consumer.accept(" Tadzik");
    }
}

@FunctionalInterface
interface Multiplier {
    int perform(int x);
}

interface Introducer {
    void run(String name);
}