package en.codegym.task.jdk13.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
The end
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        boolean flag = true;
        while (flag)
        {
            String input = reader.readLine();
            if (input.equals("end"))
                flag = false;
            else
                strings.add(input);
        }

        for (String str:strings)
        {
            System.out.println(str);
        }
    }
}