public class StringDemo {
  
    public static void main(String[] args) {
      String first = "John", last = "Doe";
      String name = first + " " + last;
      double pi = 3.14159;
      System.out.println("Name = " + name + " ");
      String s = "Hello, " + first;
      System.out.println(s + pi + 7);
      System.out.println(pi + 7 + s);
  }
  }