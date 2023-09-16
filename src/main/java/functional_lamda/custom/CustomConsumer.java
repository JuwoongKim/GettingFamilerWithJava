package functional_lamda.custom;

@FunctionalInterface
public interface CustomConsumer<T> {
    void accept(T value);

}
