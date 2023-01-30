//Main function to test the Date class and print the date, month and year based on user input
import java.util.Scanner;

public class DateTest {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a month (1-12): ");
      int month = input.nextInt();
      System.out.print("Enter a day (1-31): ");
      int day = input.nextInt();
      System.out.print("Enter a year: ");
      int year = input.nextInt();
      // Create a Date object with user input
      Date date = new Date(month, day, year);
      // Print the date
      date.printDate();
      // Close the scanner
      input.close();
  }
}