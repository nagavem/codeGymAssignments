package en.codegym.task.jdk13.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Maximum and minimum numbers in an array
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);



        //write your code here
        int[] array = new int[20];


        for (int i = 0; i < array.length ; i++) {
            int number = sc.nextInt();
            array[i] = number;
        }

        int maximum = array[0];
        int minimum = array[0];

        for (int j : array) {

            if (j > maximum)
                maximum = j;
        }

        for (int j : array) {
            if (j < minimum)
                minimum = j;
        }
        System.out.print(maximum + " " + minimum);
    }
}
