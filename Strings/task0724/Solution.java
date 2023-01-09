package en.codegym.task.jdk13.task07.task0724;

/* 
Family census
*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        Human h1 = new Human("human1",true,50);
        Human h2 = new Human("human2",false,100);
        Human h3 = new Human("human3",true,75);
        Human h4 = new Human("human4",false,50);

        Human h5 = new Human("human5",true,25,h1,h2);
        Human h6 = new Human("human6",false,30,h1,h2);
        Human h7 = new Human("human7",false,5,h1,h2);
        Human h8 = new Human("human8",true,5,h1,h2);
        Human h9 = new Human("human9",true,5,h1,h2);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h6);
        System.out.println(h7);
        System.out.println(h8);
        System.out.println(h9);
    }

    public static class Human {
        // write your code here
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null) {
                text += ", father: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }

            return text;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
    }
}