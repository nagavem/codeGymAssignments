package en.codegym.task.jdk13.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Checking the order
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
          String string =  sc.nextLine();
            strings.add(string);
        }

        for (int i = 0; i < strings.size()-1; i++) {
            if (strings.get(i).length() > strings.get(i+1).length())
            {
                System.out.println(i);
            }
        }
    }
}

