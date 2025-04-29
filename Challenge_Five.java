import java.util.Scanner;

public class Challenge_Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many times to repeat the loop
        System.out.print("How many numbers do you want to print? ");
        int limit = scanner.nextInt();

        int counter = 1;

        // WHILE loop: counts up to the limit
        while (counter <= limit) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        System.out.println("\nNow printing even numbers up to " + limit + " using FOR loop:");

        // FOR loop: prints only even numbers
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }

        scanner.close();
    }
}

