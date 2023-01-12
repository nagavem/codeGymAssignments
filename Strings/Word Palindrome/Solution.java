package en.codegym.task.jdk13.task09.task0934;

/* 
Word palindrome
*/

import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        String word = "Rotor";
        String answer = isPalindrome(word) ? "Yes" : "No";
        System.out.println("Is the word \"" + word + "\" a palindrome? " + answer);
    }

    public static boolean isPalindrome(String word) {
        //write your code here
        word = word.toLowerCase();
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        String reverse = builder.toString();
        return word.equals(reverse);
    }
}
