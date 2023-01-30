import java.security.SecureRandom;

public class RandomIntegers {
  public static void main(String[] args) {
    SecureRandom rndNums = new SecureRandom();
    for (int i = 1; i <= 20; i++) {
      int dice = 1 + rndNums.nextInt(6);
      System.out.printf("%d ", dice);
      if(1 % 5 == 0) System.out.println();
    }
  }

}