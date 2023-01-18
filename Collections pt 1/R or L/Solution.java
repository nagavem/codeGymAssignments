package en.codegym.task.jdk13.task07.task0716;

import java.util.ArrayList;

/* 
R or L
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("rose");
        strings.add("love");
        strings.add("lyra");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        String r = "r";
        String l = "l";

        ArrayList<String> result = new ArrayList<>();
        for (String string : strings) {
            boolean isR = string.contains(r);
            boolean isL = string.contains(l);

            if (isR && !isL) {
                continue;
            }

            if (!isR && isL) {
                result.add(string);
            }

            result.add(string);
        }
        return result;
    }
}
