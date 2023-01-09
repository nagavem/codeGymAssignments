package en.codegym.task.jdk13.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Remove and insert
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        List<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<5;i++)
        {
            strings.add(sc.next());
        }

        int n = 13;
        while (n>0) {
            String last = strings.get(strings.size()-1);
            strings.remove(strings.size()-1);
            strings.add(0,last);
            n-=1;
        }

        for(String str : strings)
        {
            System.out.println(str);
        }
    }
}
