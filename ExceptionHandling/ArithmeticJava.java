package ExceptionHandling;

import java.io.*;

public class ArithmeticJava {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 0;

        try {
            // Code that may throw exception
            int answer = number1 /  number2;
            System.out.println("Answer is: " + answer);
        }
         catch (ArithmeticException e) {

            //Handling the exception
             System.out.println("Error: Division by zero is not allowed");
         }
        finally {
            System.out.println("Program continues after handling the exception.");
        }
    }
}
