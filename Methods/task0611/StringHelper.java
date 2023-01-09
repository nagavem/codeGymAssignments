package en.codegym.task.jdk13.task06.task0611;

/* 
StringHelper class
*/

public class StringHelper {
    public static String multiply(String text) {
        String result = "";
        int i = 5;
        //write your code here
        while (i>0)
        {
            result+= text;
            i--;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        //write your code here
        for (int i =0;i<count;i++)
        {
            result+= text;
        }
        return result;
    }

    public static void main(String[] args) {
        String res1 = multiply("Amigo");
        String res2 = multiply("Naga",3);
        System.out.println(res1);
        System.out.println(res2);

    }
}
