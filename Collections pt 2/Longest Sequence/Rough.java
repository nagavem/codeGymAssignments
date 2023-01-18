package en.codegym.task.jdk13.task08.task0812;

import java.io.*;
import java.util.ArrayList;

public class Rough {

    private ArrayList<Integer> list;

    public void write(int data)
    {
        list.add(data);
    }

    public int read()
    {
        int first = list.get(0);
        list.remove(0);
        return first;
    }

    public int available()
    {
        return list.size();
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("rand");
        Rough object = new Rough();

        while (inputStream.available()>0)
        {
            int data = inputStream.read();
            object.write(data);
        }
        inputStream.close();
    }
}
