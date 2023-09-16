package functional_lamda;

import functional_lamda.custom.*;

public class Scenario {

    public void simpleWithClass() {
        Simple simple = new Simple() {
            @Override
            public int makeDouble(int value) {
                return value * 2;
            }
        };

        int result = simple.makeDouble(10);
        System.out.println(result);
    }

    public void simpleWithLambda() {

        Simple simple1 = (num) -> num * 2;

        Simple simple2 = (num) -> {
            return num * 2;
        };

        int result = simple1.makeDouble(10);
        int result2 = simple2.makeDouble(10);

    }

    public void simpleGenericWithClass() {
        SimpleGeneric<Double> doubleSimpleGeneric = new SimpleGeneric<>() {
            @Override
            public String toString(Double value) {
                return String.valueOf(value);
            }
        };

        String result = doubleSimpleGeneric.toString(10.1);
    }

    public void simpleGenericWithLambda() {
        SimpleGeneric<Double> doubleSimpleGeneric = (a) -> String.valueOf(a);
        SimpleGeneric<Integer> integerSimpleGeneric = (a) -> String.valueOf(a);

        String result = doubleSimpleGeneric.toString(10.1);
        String result2 = integerSimpleGeneric.toString(10);
    }

    public void customConsumer() {
        CustomConsumer<Integer> consumer = (ele) -> System.out.println(ele);
        consumer.accept(10);
    }

    public void customPredicate() {
        CustomPredicate<String> predicate = (str) -> str.contains("a");
        boolean result = predicate.test("apple");
    }

    public void customSupplier() {
        CustomSupplier<String> supplier = () -> new String("wall");
        String result = supplier.get();
    }

    public void customFunction() {
        CustomFunction<Integer, String> function = (num) -> String.valueOf(num);
        String result = function.apply(10);

    }

    public void customComparator() {
        CustomComparator<Integer> comparator = (o1, o2) -> o2 - o1;
        comparator.compare(10, 9);
    }

    public void biFunction() {
        CustomBiFunction<String, String, String> biFunction = (str1, str2) -> str1 + str2;
        String result = biFunction.apply("juwwong", "Kim");
    }

    public void biConsumer() {
        CustomBiConsumer<String, Integer> biConsumer = (str, num) -> System.out.println(str + num);
        biConsumer.accept("juwoong", 29);
    }

    public void biPredicate() {
        CustomBiPredicate<String, String> biPredicate = (str1, str2) -> str1.equals(str2);
        boolean result = biPredicate.test("juwoong", "jjowooong");
    }

}
