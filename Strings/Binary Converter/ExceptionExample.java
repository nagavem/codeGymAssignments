package en.codegym.task.jdk13.task09.task0906;

public class ExceptionExample {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element:stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
    }
}
