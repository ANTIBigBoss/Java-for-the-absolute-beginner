//Factorial of positive integer
import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter positive integer: ");
        int n = input.nextInt();
        //-------------------------------------------------------
        int f = 1;
        for(int i = 1; i <= n; i++)
        f *= i;
        System.out.printf("Factorial = %d\n\n", f);
        input.close();
    }
}