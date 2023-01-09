package en.codegym.task.jdk13.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Words in reverse
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for(int i =0;i<5;i++)
        {
           list.add(sc.nextLine());
        }

        list.remove(2);
        Collections.reverse(list);

        for (String str: list)
        {
            System.out.println(str);
        }
    }
}
