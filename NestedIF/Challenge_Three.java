package NestedIF;

import java.util.Scanner;

public class Challenge_Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score (0 - 100): ");
        int score = scanner.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("Excellent! You got an A.");
            } else if (score >= 80) {
                System.out.println("Great job! You got a B.");
            } else if (score >= 70) {
                System.out.println("Good effort! You got a C.");
            } else if (score >= 60) {
                System.out.println("You passed with a D.");
            } else {
                System.out.println("Oops! You got an F.");
            }
        } else {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
        }

        scanner.close();
    }
}

