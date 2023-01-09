package en.codegym.task.jdk13.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Controlling body weight
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // write your code here
            double bmi = weight / (height * height);

            if (bmi < 18.5)
                System.out.println("Underweight: BMI < 18.5");
            else if (bmi>=18.5 && bmi < 25)
                System.out.println("Normal: 18.5 <= BMI < 25");
            else if (bmi>=25 && bmi < 30)
                System.out.println("Overweight: 25 <= BMI < 30");
            else
                System.out.println("Obese: BMI >= 30");
        }
    }
}
