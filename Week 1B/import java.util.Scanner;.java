import java.util.Scanner;
public class Arduino {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print(s: "\nEnter 1, 2, or 3: ");
        int n = input.nextInt();
        //------------------------------------------------------------
        switch(n)
        {
            case 1: System.out.println(x: "Arduino Uno"); break;
            case 2: System.out.println(x: "Arduino Nano"); break;
            case 3: System.out.println(x: "Arduino Mega"); break;
            default: System.out.println(x: "Invalid input!");
        }
        input.close();
    }
}
