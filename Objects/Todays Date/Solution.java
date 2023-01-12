package en.codegym.task.jdk13.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Month;
import java.time.LocalDate;

/* 
Display today's date
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
    }


}
