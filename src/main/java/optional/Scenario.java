package optional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Scenario {

    public void func0() {
        List<String> strs = List.of("first, second", null);
        for (String str : strs) {
            System.out.println(str);
        }
    }

    public void func1() {
        String str = null;
        Optional<String> ops = Optional.of(str);
    }

    public void func2() {
        String str = null;
        Optional<String> ops = Optional.ofNullable(str);
    }

    public void func3() {
        Optional<String> str1 = Optional.of("String");

        if (str1.isPresent()) {
            System.out.println(str1.get());
        }

        Optional<String> str2 = Optional.ofNullable(null);

        if (str2.isEmpty()) {
            System.out.println("Empty");
        }
    }

    public void func4() {
        Optional<String> ele = Optional.ofNullable(null);

        String result2 = ele.orElse("Alter");
        System.out.println(result2);

        String result3 = ele.orElseGet(() -> new String("Alter"));
        System.out.println(result3);

        String result4 = ele.orElseThrow(() -> new NoSuchElementException());
        System.out.println(result4);
    }

    public void func5() {
        Optional<String> ele = Optional.ofNullable("String");

        String result1 = ele.get();
        System.out.println(result1);

        String result2 = ele.orElse("Alter");
        System.out.println(result2);

        String result3 = ele.orElseGet(() -> new String("Alter"));
        System.out.println(result3);

        String result4 = ele.orElseThrow(() -> new NoSuchElementException());
        System.out.println(result4);

    }

}
