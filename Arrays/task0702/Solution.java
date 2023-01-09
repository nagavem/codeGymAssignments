package en.codegym.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
String array in reverse order
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String arr[] = new String[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<8;i++)
        {
            arr[i] = sc.nextLine();
        }
        for(int i = arr.length-1;i>-1;i--)
        {
            System.out.println(arr[i]);
        }
    }
}