import java.util.Scanner;

public class Challenge_Two{
    void showInterest() {
        double schoolFees;
        double registrationFees;
        double amount;


        System.out.print("Enter student name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        schoolFees = 1200.00;
        System.out.println("School Fees: " + schoolFees);

        registrationFees = 100.00;
        System.out.println("Registration Fees: " + registrationFees);

        amount = schoolFees + registrationFees;
        System.out.println("Amount: " + amount);


    }
    public static void main(String[] args) {
        Challenge_Two obj = new Challenge_Two();
        obj.showInterest();
    }
}
