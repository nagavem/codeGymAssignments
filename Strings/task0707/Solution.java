package en.codegym.task.jdk13.task07.task0707;

import java.util.ArrayList;

/* 
5 different strings in a list
*/

public class Solution {

    public static ArrayList<String> list;

    public static void main(String[] args) {
        //write your code here
        list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list.size());
        for (String str:list)
        {
            System.out.println(str);
        }
    }
}
