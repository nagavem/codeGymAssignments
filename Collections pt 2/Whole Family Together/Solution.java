package en.codegym.task.jdk13.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
The whole family together
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Human firstChild = new Human("Michael",true,15);
        Human secondChild = new Human("Liam",false,10);
        Human thirdChild = new Human("Joseph",true,5);

        Human father = new Human("David",true,33,firstChild,secondChild,thirdChild);
        Human mother = new Human("Grace",false,29,firstChild,secondChild,thirdChild);

        Human paternalGrandfather = new Human("Own",true,69,father);
        Human paternalGrandmother = new Human("Grace",false,65,father);

        Human maternalGrandfather = new Human("Nathan",true,63,mother);
        Human maternalGrandmother = new Human("Hannah",false,62,mother);

        System.out.println(paternalGrandfather);
        System.out.println(paternalGrandmother);
        System.out.println(maternalGrandfather);
        System.out.println(maternalGrandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(firstChild);
        System.out.println(secondChild);
        System.out.println(thirdChild);



    }

    public static class Human {
        //write your code here
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name,boolean sex,int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name,boolean sex,int age, Human... children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;

            Collections.addAll(this.children,children);
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
