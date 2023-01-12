package en.codegym.task.jdk13.task09.task0906;

/* 
Logging stack traces
*/

public class Solution {

    public static void main(String[] args) {
        log("In method");
    }

    public static void log(String text) {
        //write your code here
        StackTraceElement element  = Thread.currentThread().getStackTrace()[2];
        String fileName = element.getFileName();
        String methodName = element.getMethodName();
        System.out.println(fileName + ": "+methodName + ": "+ text);
    }
}
