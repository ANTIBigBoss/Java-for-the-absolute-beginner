import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lesson 4: Arrays & ArrayLists");

        // Declare an array of integers with a fixed size of 5
        int[] numbersArray = new int[5];

        // Declare an ArrayList of integers with a dynamic size
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Infinite loop to allow multiple attempts at adding numbers to the array and ArrayList
        while (true) {
            try {
                System.out.print("Enter a number to add to the array: ");
                int numberToAdd = scanner.nextInt();
                
                System.out.print("Enter the index where you want to add the number (0-4): ");
                int indexToAdd = scanner.nextInt();

                // Attempt to add the number to the array at the specified index
                numbersArray[indexToAdd] = numberToAdd;
                System.out.println("Number added to the array!");

                // Attempt to add the number to the ArrayList at the specified index
                numbersList.add(indexToAdd, numberToAdd);
                System.out.println("Number added to the ArrayList!");

                // Print the updated array and ArrayList
                System.out.print("Updated array: ");
                for (int num : numbersArray) {
                    System.out.print(num + " ");
                }
                System.out.println();

                System.out.print("Updated ArrayList: ");
                for (int num : numbersList) {
                    System.out.print(num + " ");
                }
                System.out.println();

                // Exit the loop since the addition was successful
                break;
            }
            // Catch index-related exceptions
            catch (IndexOutOfBoundsException | InputMismatchException e) {
                System.err.println("An error occurred: " + e.getMessage());
                System.err.println("Please provide a valid index (0-4) and a number.");

                // Clear the scanner input buffer in case of InputMismatchException
                if (e instanceof InputMismatchException) {
                    scanner.nextLine();
                }
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