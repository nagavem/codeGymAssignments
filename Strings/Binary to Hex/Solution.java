package en.codegym.task.jdk13.task09.task0908;

/* 
Exception while working with strings
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
    try {
        String s = null;
        String m = s.toLowerCase();
    }
    catch (NullPointerException e)
    {
        System.out.println(e.getClass().getName());
    }

        //write your code here
    }
}
