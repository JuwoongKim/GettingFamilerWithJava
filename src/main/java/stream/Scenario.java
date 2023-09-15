package stream;

import java.util.*;
import java.util.stream.*;

public class Scenario {

    // 생성
    public void makeArrayStream() {
        String[] arr = new String[]{"person1", "person2", "person3", "banana"};
        Stream<String> stream = Arrays.stream(arr);
    }

    public void makeListStream() {
        String[] arr = new String[]{"person1", "person2", "person3", "banana"};
        Stream<String> stream = List.of(arr).stream();
    }

    public void makeRawTypeStream() {
        IntStream intStream = IntStream.rangeClosed(1, 10);
    }

    public void makeStreamWithIterate() {
        Stream<Integer> iterate = Stream.iterate(0, n -> n <= 10, n -> n + 1);
    }

    public void makeStreamWithGenerate() {
        Stream<String> generate = Stream.generate(() -> "NONE");
    }

    // 가공
    public void filter() {
        String[] arr = new String[]{"person1", "person2", "person3", "banana"};
        List.of(arr).stream()
                .filter(ele -> ele.contains("per"))
                .forEach(System.out::println);
    }

    public void simpleMap() {
        String[] arr = new String[]{"person1", "person2", "person3", "banana"};

        String[] result = List.of(arr).stream()
                .map(ele -> ele + " (checking str)")
                .toArray(String[]::new);
    }

    public void mapToXXX() {
        double[] array = Stream.of(1, 2, 3, 4, 5)
                .mapToDouble(Integer::doubleValue)
                .toArray();
    }

    public void boxed() {
        List<Integer> list = IntStream.rangeClosed(1, 10)
                .boxed()
                .toList();
    }

    public void flatMapWithArray() {
        String[][] arr = {{"apple, grape"}, {"cup", "car"}, {"board", "phone"}};

        List<String> list = Arrays.stream(arr)
                .flatMap(Arrays::stream)
                .toList();
    }

    public void flatMapWithList() {
        List<List<Integer>> list = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        String[] array = list.stream()
                .flatMap(Collection::stream)
                .toArray(String[]::new);

    }

    public void flatMapToXXX() {
        List<List<Integer>> list = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        double[] array = list.stream()
                .flatMapToDouble(sub -> sub.stream().mapToDouble(Integer::doubleValue))
                .toArray();
    }

    public void sort() {
        String[] arr = new String[]{"person1", "person2", "person3", "banana"};
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);
    }

    public void sortWithCustom() {
        String[] arr = new String[]{"person1", "person2", "person3", "banana"};
        Arrays.stream(arr)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }

    public void iterate() {
        List<Integer> list = IntStream.range(1, 11)
                .boxed()
                .peek(i -> System.out.println(i + "this is comsumer"))
                .toList();
    }

    // 결과물

    //loop
    public void forEach() {
        Stream.of(1, 2, 3, 4, 5)
                .map(String::valueOf)
                .map(str -> str + "checked")
                .forEach(System.out::println);
    }

    //collect
    public void collectJoining() {
        String[] arr = new String[]{"person1", "person2", "person3", "banana"};
        String str = Arrays.stream(arr)
                .filter(ele -> ele.contains("banana"))
                //.collect(Collectors.joining());
                .collect(Collectors.joining(", ", "<", ">"));
    }

    public void collectToSet() {
        Set<Integer> collect = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toSet());

    }

    public void collectSummingInt() {
        List<Person> people = List.of(
                new Person("1", 10),
                new Person("2", 20),
                new Person("3", 30)
        );

        Integer sum = people.stream()
                .collect(Collectors.summingInt(Person::getAge));

    }

    public void collectAverageLong() {
        List<Person> people = List.of(
                new Person("1", 10),
                new Person("2", 20),
                new Person("3", 30)
        );

        Double average = people.stream()
                .collect(Collectors.averagingDouble(Person::getAge));
    }

    public void groupBy() {
        List<Person> people = List.of(
                new Person("1", 10),
                new Person("1", 20),
                new Person("1", 30),
                new Person("1", 30),
                new Person("2", 20),
                new Person("3", 30)
        );

        Map<String, List<Person>> collect = people.stream()
                .collect(Collectors.groupingBy(Person::getName));
    }

    public void partitioning() {
        List<Person> people = List.of(
                new Person("1", 10),
                new Person("1", 20),
                new Person("1", 30),
                new Person("1", 30),
                new Person("2", 20),
                new Person("3", 30)
        );

        Map<Boolean, List<Person>> collect = people.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() <= 20));
    }

    // calculate
    public void calculate() {
        List<Person> people = List.of(
                new Person("1", 10),
                new Person("1", 20),
                new Person("1", 30),
                new Person("1", 30),
                new Person("2", 20),
                new Person("3", 30)
        );

        IntStream intStream = people.stream()
                .mapToInt(person -> person.getAge());

        long count = intStream.count();
        double average = intStream.average().orElseGet(() -> -1L);
        int min = intStream.min().orElseGet(() -> Integer.MIN_VALUE);
        int max = intStream.max().orElseGet(() -> Integer.MAX_VALUE);

    }

    // reduce
    public void reduce() {
        int reduce1 = IntStream.rangeClosed(1, 10)
                .reduce(10, (a, b) -> a + b);

        int reduce2 = IntStream.rangeClosed(1, 10)
                .reduce((a, b) -> a + b)
                .orElseGet(() -> 0);
    }

}
