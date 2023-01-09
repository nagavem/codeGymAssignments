package en.codegym.task.jdk13.task07.task0716;

import java.util.ArrayList;

/* 
R or L
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("rose");
        strings.add("love");
        strings.add("lyra");
        fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //write your code here
      String r = "r";
      String l = "l";

      ArrayList<String> result = new ArrayList<>();
      for (String str:strings) {
          boolean isR = str.contains(r);
          boolean isL = str.contains(l);

          if (isR && !isL) {
              continue;
          }

          if (!isR && isL) {
              result.add(str);
          }
          result.add(str);
      }
      return result;
    }
}