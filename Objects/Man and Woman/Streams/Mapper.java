package en.codegym.task.jdk13.task05.task0526.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapper {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");

        names.stream()
                .filter(Mapper::isNotName)
                .map( UserTest::new)
                .forEach(System.out::println);

    List<UserTest> users =    names.stream()
                .filter(Mapper::isNotName)
                .map(UserTest::new)
                .collect(Collectors.toList());
    }

    private static boolean isNotName(String name) {
        return !name.equals(("Sam"));
    }
}

class UserTest {
    private String name;
    private Integer age = 30;

    public UserTest(String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name :" + name + '\'' +
                ", age: " + age ;
    }
}
