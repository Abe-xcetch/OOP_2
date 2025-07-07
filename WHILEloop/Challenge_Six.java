package WHILEloop;

import java.util.Random;

public class Challenge_Six {

    public static void main(String[] args) {
        Random rand = new Random();
        int studentCount = 5;

        int i = 1;
        while (i <= studentCount) {
            int score = rand.nextInt(101);
            System.out.println("Student " + i + " scored: " + score);

            if (score >= 90) {
                System.out.println("Grade: A");
            } else {
                if (score >= 80) {
                    System.out.println("Grade: B");
                } else {
                    if (score >= 70) {
                        System.out.println("Grade: C");
                    } else {
                        if (score >= 60) {
                            System.out.println("Grade: D");
                        } else {
                            System.out.println("Grade: F");
                        }
                    }
                }
            }

            System.out.println();
            i++;
        }

        for (int j = 0; j < 3; j++) {
            System.out.println("Processing complete...");
        }
    }
}
