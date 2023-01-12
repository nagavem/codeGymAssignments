package en.codegym.task.jdk13.task05.task0526.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Peter", 20, Arrays.asList("1", "2")),
                new User("Sam", 40, Arrays.asList("3", "4", "5")),
                new User("Ryan", 60, Arrays.asList("6","5")),
                new User("Adam", 70, Arrays.asList("7", "8"))
        );


        System.out.println("Functional Style: ");


        Optional<String> stringOptional = users.stream()
                .map(user -> user.getPhoneNumbers().stream())
                .flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("10")))
                .findAny();

        stringOptional.ifPresent(System.out::println);

    }

    private static boolean isNotName(String name) {
        return !name.equals(("Sam"));
    }
}


 class User {
    private String name;
    private Integer age = 30;
    private List<String> phoneNumbers;

    public User(String name,int age,List<String> phoneNumbers) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public List<String> getPhoneNumbers() {
         return phoneNumbers;
     }

     public void setPhoneNumbers(List<String> phoneNumbers) {
         this.phoneNumbers = phoneNumbers;
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