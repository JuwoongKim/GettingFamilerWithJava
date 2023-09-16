package functional_lamda.custom;

@FunctionalInterface
public interface CustomBiPredicate <T,U> {
    boolean test(T t, U u);
}
