import java.util.Scanner;         // Import for user input
import java.time.LocalDateTime;   // Import for current date and time
import java.time.format.DateTimeFormatter; // Optional: format date/time

public class Challenge_Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        // Greet the user
        System.out.println("Hello, " + name + "!");
        System.out.println("Current date and time: " + now.format(formatter));

        scanner.close();
    }
}

