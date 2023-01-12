package en.codegym.task.jdk13.task05.task0526.Streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");

        names.stream()
                .filter(Filter::isNotName)
                .forEach(System.out::println);
    }

    private static boolean isNotName(String name) {
        return !name.equals(("Sam"));
    }
}
