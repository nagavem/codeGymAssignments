package en.codegym.task.jdk13.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* 
In decreasing order
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //write your code here
        Arrays.sort(array);

        int n = array.length;
        for (int i = 0; i < n/2; i++) {
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
    }
}
