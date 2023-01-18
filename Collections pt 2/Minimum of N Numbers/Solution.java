package en.codegym.task.jdk13.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Minimum of N numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        // Find the minimum here
        int minimum = list.get(0);
        for (int i:list)
        {
            if (i < minimum)
            {
                minimum = i;
            }
        }
        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Create and initialize a list here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            integers.add(num);
        }
        return integers;
    }
}
