package en.codegym.task.jdk13.task07.task0715;

import java.util.ArrayList;
import java.util.List;

/* 
More Sam-I-Am
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        List<String> list = new ArrayList<>();
        list.add("Sam");
        list.add("I");
        list.add("Am");

        list.add(1,"Ham");
        list.add(3,"Ham");
        list.add(5,"Ham");


        for (String str:list)
        {
            System.out.println(str);
        }

    }
}
