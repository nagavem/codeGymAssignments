package en.codegym.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Minimum or maximum
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //write your code here
        strings = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            strings.add(sc.next());
        }


        String shortest = strings.get(0);
        String longest = strings.get(0);

        for (String string : strings) {
            if (string.length() < shortest.length()) {
                shortest = string;
            }

            if (longest.length() < string.length()) {
                longest = string;
            }
        }
        int shortindex = strings.indexOf(shortest);
        int longIndex = strings.indexOf(longest);

        if (shortindex < longIndex)
            System.out.println(shortest);
        else System.out.println(longest);

    }
}
