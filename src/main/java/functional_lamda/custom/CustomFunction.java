package functional_lamda.custom;

@FunctionalInterface
public interface CustomFunction <T, R>{
    R apply(T t);
}
