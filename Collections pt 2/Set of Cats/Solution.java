package en.codegym.task.jdk13.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set of cats
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3

        cats.remove(cats.iterator().next());
        printCats(cats);

    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Set<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        return cats;

    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for (Cat cat:cats)
        {
            System.out.println(cat);
        }
    }

    // step 1

    public static class Cat{
        public Cat() {
        }
    }
}
