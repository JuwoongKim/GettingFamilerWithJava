package functional_lamda.custom;

@FunctionalInterface
public interface CustomPredicate<T> {
    boolean test(T t);
}
