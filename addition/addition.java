import java.util.Scanner;  // Import the Scanner class

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Asking the user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();  // Read user input

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  // Read user input

        // Adding the numbers
        int sum = num1 + num2;

        // Printing the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Closing the scanner
        scanner.close();
    }
}
