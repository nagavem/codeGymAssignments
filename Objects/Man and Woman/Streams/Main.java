package en.codegym.task.jdk13.task05.task0526.Streams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> bingoNums = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50",
                "I26", "I17", "I29",
                "071");

        bingoNums.forEach(number -> {
            if (number.startsWith("G")){
                System.out.println(number);
            }
        });

    }
}
