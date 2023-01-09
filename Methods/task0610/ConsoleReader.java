package en.codegym.task.jdk13.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
ConsoleReader class
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //write your code here
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }

    public static int readInt() throws Exception {
        //write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        return a;
    }

    public static double readDouble() throws Exception {
        //write your code here
        //write your code here
        Scanner in = new Scanner(System.in);
        double b = in.nextDouble();
        return b;
    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        Scanner in = new Scanner(System.in);
        boolean c = in.nextBoolean();
        return c;
    }

    public static void main(String[] args) throws Exception {

    }
}
