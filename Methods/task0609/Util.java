package en.codegym.task.jdk13.task06.task0609;

/* 
Distance between two points
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here
        double distance;
        distance = Math.sqrt(((x2 - x1) *(x2 - x1) + ((y2 - y1) * (y2 - y1))));
        return distance;
    }

    public static void main(String[] args) {

        double distance = getDistance(5, 10, 15, 20);
        System.out.println(distance);
    }
}
