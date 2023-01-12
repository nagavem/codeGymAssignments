package en.codegym.task.jdk13.task06.task0612;

/* 
Calculator
*/

public class Calculator {
    public static int plus(int a, int b) {
        //write your code here
        return a + b;
    }

    public static int minus(int a, int b) {
        //write your code here
        int res = a - b;
        return res;
    }

    public static int multiply(int a, int b) {
        //write your code here
        int res = a*b;
        return res;
    }

    public static double divide(int a, int b) {
        //write your code here
        return (a * 1.0)/b;
    }

    public static double percent(int a, int b) {
        //write your code here
        return (a * b * 1.0)/100;
    }

    public static void main(String[] args) {
        System.out.println(percent(4,50));
    }
}