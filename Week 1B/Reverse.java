import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter a 4-digit number: ");
    int num = input.nextInt();

    System.out.print("Reverse: ");
    while(num != 0)
    {
        int digit = num % 10;
        System.out.print(digit);
        num /= 10;
    }
    input.close();
}
}