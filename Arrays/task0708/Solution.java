package en.codegym.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
The largest number
*/

public class Solution {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            integers.add(sc.nextInt());
        }
        int max = 0;
        for (int integer:integers)
        {
            if (integer > max)
            {
                max = integer;
            }
        }
        System.out.println(max);
    }
}
