package en.codegym.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Street and houses
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        int arr[] = new int[15];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<15;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        
        int sum_odd = 0,sum_even = 0;
        
        for(int i=0;i<15;i++)
        {
            if(i%2 != 0)
            {
                sum_odd+= arr[i];
            }
            
            else
                sum_even+= arr[i];
        }
        
        if(sum_even > sum_odd)
        {
            System.out.println("Even-numbered houses have more residents.");
        }
        
        else if(sum_odd > sum_even)
        {
            System.out.println("Odd-numbered houses have more residents.");
        }
        
        else
            System.out.println();
    }
}
