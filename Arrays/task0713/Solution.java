package en.codegym.task.jdk13.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Three arrays
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            numbers.add(sc.nextInt());
        }
        for (Integer number : numbers)
        {
            if (number % 3 == 0)
            {
                if (number % 2 == 0)
                {
                    divBy2.add(number);
                }
                divBy3.add(number);
            }

            else if (number % 2 == 0)
            {
                divBy2.add(number);
            }

            else
            {
                others.add(number);
            }
        }

        printList(divBy3);
        printList(divBy2);
        printList(others);

    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer i: list)
        {
            System.out.println(i);
        }
    }
}
