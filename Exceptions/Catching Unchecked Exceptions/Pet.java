package en.codegym.task.jdk13.task09.task0917;

public class Pet {
    int x = 5, y = 5;
    int weight = 10;

    Pet(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Cat cat = new Cat(50,50,5);
    }
}

class Cat extends Pet{
    int tailLength = 8;
    int age;
    Cat(int x, int y, int age)
    {
        super(x,y);
        this.age =age;
    }
}
