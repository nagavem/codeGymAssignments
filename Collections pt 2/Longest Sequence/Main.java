import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 6, 6, 7, 8, 9, 9);

        // Get the length of the longest repeating sequence
        int longestSequenceLength = getLongestRepeatingSequenceLength(numbers);

        // Display the length of the longest repeating sequence
        System.out.println("Length of longest repeating sequence: " + longestSequenceLength);
    }

    public static int getLongestRepeatingSequenceLength(List<Integer> numbers) {
        // Initialize the length of the longest repeating sequence to 0
        int longestSequenceLength = 0;

        // Create a map to store the counts of each number
        Map<Integer, Integer> numberCounts = new HashMap<>();

        // Iterate over the list of numbers
        for (int number : numbers) {
            // Update the count of the current number in the map
            numberCounts.put(number, numberCounts.getOrDefault(number, 0) + 1);

            // Update the length of the longest repeating sequence
            longestSequenceLength = Math.max(longestSequenceLength, numberCounts.get(number));
        }

        return longestSequenceLength;
    }
}
