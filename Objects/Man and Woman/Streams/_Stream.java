//package en.codegym.task.jdk13.task05.task0526.Streams;
//
//
//import java.util.List;
//
//import static en.codegym.task.jdk13.task05.task0526.Streams._Stream.Gender.*;
//
//public class _Stream {
//    public static void main(String[] args) {
//
//        List<Person> people = List.of(
//                new Person("John", MALE),
//                new Person("Maria", FEMALE),
//                new Person("Aisha", FEMALE),
//                new Person("Alex", MALE),
//                new Person("Alice", FEMALE)
//        );
//
//        people.stream()
//                .
//    }
//
//    static class Person {
//        private final String name;
//        private final Gender gender;
//
//        public Person(String name, Gender gener) {
//            this.name = name;
//            this.gender = gener;
//        }
//
//        @Override
//        public String toString() {
//            return "Person{" +
//                    "name='" + name + '\'' +
//                    ", gender=" + gender +
//                    '}';
//        }
//    }
//
//    enum Gender {
//        MALE,FEMALE
//    }
//}
