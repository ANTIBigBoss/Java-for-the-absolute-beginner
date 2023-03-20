import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program continues after the try-catch-finally block.");

        // Infinite loop to allow multiple attempts at division
        while (true) {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // The "try" block is where we put the code that might throw an exception
            try {
                // Attempt to divide the two numbers
                int result = numerator / denominator;

                // If no exception occurs, this line will be executed
                System.out.println("The result of the division is: " + result);

                // Exit the loop since the division was successful
                break;
            }
            // The "catch" block is where we handle the exception if it occurs
            catch (ArithmeticException e) {
                // This block of code will only be executed if an exception of type ArithmeticException occurs

                // Print an error message and the details of the exception
                System.err.println("An error occurred: " + e.getMessage());

                // In this case, the error is likely a division by zero, so we can provide a more specific message
                System.err.println("Cannot divide by zero. Please provide a non-zero denominator.");
            }
            // The "finally" block is optional and will be executed no matter what, whether an exception occurs or not
            finally {
                System.out.println("This is the finally block. It will always be executed.");
            }
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
