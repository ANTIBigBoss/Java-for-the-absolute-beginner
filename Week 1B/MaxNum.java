public class MaxNum {
    public static void main(String[] args) 
    {
      int n1 = 56, n2 = 75, n3 = 89;
      if (n1 > n2 && n1 > n3)
        System.out.printf(format: "\nMaximum: %d\n\n", n1);
      else if (n2 > n1 && n2 > n3)
        System.out.printf(format: "\nMaximum: %d\n\n", n2);
      else (n3 > n1 && n3 > n2)
        System.out.printf(format: "\nMaximum: %d\n\n", n3);
    }
  }