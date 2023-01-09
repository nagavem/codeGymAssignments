package en.codegym.task.jdk13.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Shuffled just in time
*/

public class Solution {
    public static void main(String[] args) throws IOException {





        //write your code here

        Scanner sc = new Scanner(System.in);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        for (int i = 0;i<m;i++){
            strings.add(strings.remove(0));
        }

        for (String str:strings)
        {
            System.out.println(str);
        }
    }
}
