package Recurssion;

public class Factorial {

    public static int factorial (int n) {
        //Base case
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n + factorial of (n-1)
            return n * factorial(n -1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(10);// Calculate the factorial of 5
        System.out.println(result); //Output: factorial: 120
    }
}
