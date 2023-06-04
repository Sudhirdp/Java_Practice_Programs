import java.util.Scanner;

public class SwitchProb3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = input.nextInt();

        System.out.println("Enter the second number:");
        int num2 = input.nextInt();

        if (num1 > 0 && num2 > 0) {
            int result = num1 * num2;
            System.out.println("Multiplication Result: " + result);

            switch (result % 2) {
                case 0:
                    System.out.println("The result is an even number.");
                    break;
                case 1:
                    System.out.println("The result is an odd number.");
                    break;
            }
        } else {
            System.out.println("Sorry, negative numbers are not allowed. Program terminated.");
        }

        input.close();
    }
}

