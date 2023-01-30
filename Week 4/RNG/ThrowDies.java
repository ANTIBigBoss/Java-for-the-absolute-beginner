import java.security.SecureRandom;

public class ThrowDies {
  public static void main(String[] args) {
    SecureRandom rndNums = new SecureRandom();

    int die1 = 1 + rndNums.nextInt(6);
    int die2 = 1 + rndNums.nextInt(6);
    int sum = die1 + die2;

    System.out.println("\nDice sum: " + sum);
    if (sum == 7 || sum == 11)
      System.out.println("\nYou win!");
    else
      System.out.println("\nYou lose!");
  }
}