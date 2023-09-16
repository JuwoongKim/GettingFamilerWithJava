package enum_;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public enum Simple3 {
    ONE(s -> System.out.println(s), (a, b) -> a + b),
    TWO(s -> System.out.println(s), (a, b) -> a + b),
    THREE(s -> System.out.println(s), (a, b) -> a + b),
    FOUR(s -> System.out.println(s), (a, b) -> a + b);

    Consumer<String> consumer;
    BiFunction<Integer, Integer, Integer> biFunction;

    Simple3(Consumer<String> consumer, BiFunction<Integer, Integer, Integer> biFunction) {
        this.consumer = consumer;
        this.biFunction = biFunction;
    }

    public void print(String input) {
        consumer.accept(input);
    };

    public int compute(int a, int b) {
        return biFunction.apply(a, b);
    };

}
