import java.util.Scanner;

public class SwitchProb5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Menu Selection Program!");
        System.out.println("Please select an option:");
        System.out.println("1. View Profile");
        System.out.println("2. Edit Profile");
        System.out.println("3. Logout");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Viewing Profile...");
                // Code for viewing profile
                break;
            case 2:
                System.out.println("Editing Profile...");
                // Code for editing profile
                break;
            case 3:
                System.out.println("Logging out...");
                // Code for logging out
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }

        input.close();
    }
}

