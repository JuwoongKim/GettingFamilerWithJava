package functional_lamda.custom;

@FunctionalInterface
public interface CustomComparator<T> {
    int compare(T o1, T o2);
}
