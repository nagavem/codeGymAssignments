package en.codegym.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Expressing ourselves more concisely
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
    List<String> str = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s4 = sc.next();
        String s5 = sc.next();

        str.add(s1);
        str.add(s2);
        str.add(s3);
        str.add(s4);
        str.add(s5);

        String shortest = str.get(0);

        for (String string:str)
        {
            if (string.length()<shortest.length())
            {
                shortest = string;
            }
        }

        for (String string:str)
        {
            if (string.length() == shortest.length())
            {
                System.out.println(string);
            }
        }

    }
}
