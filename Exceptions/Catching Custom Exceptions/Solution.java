package en.codegym.task.jdk13.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Catching custom exceptions
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            handleExceptions();
        }
        catch (IOException e)
        {
            BEAN.log(e);
        }

    }

    public static void handleExceptions() throws IOException,FileSystemException {
        try {
            BEAN.throwExceptions();
        }
        catch (IOException e)
        {
            if (e instanceof FileSystemException)
            {
                BEAN.log(e);
                throw e;
            }
            else
            {
                BEAN.log(e);
            }
        }
    }

    public static class StatelessBean {

        public int i = (int) (Math.random() * 3);

        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void throwExceptions() throws CharConversionException, FileSystemException, IOException {
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
