import java.util.Scanner;
public class StudentTest
  {
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      Student std1 = new Student();
//------------------------------------
      System.out.print( "Enter Student's Name: " );
      String studentName = input.nextLine();
      System.out.print( "Enter Student ID: " );
      int studentID = input.nextInt();
//------------------------------------
    std1.setStudentName(studentName, studentID);
//------------------------------------
    System.out.println( "Student Info: ");
      System.out.printf( "Name: %s%n", std1.getStudentName() );
      System.out.printf( "ID: %s%n", std1.getStudentID() );
//------------------------------------
      System.out.println( "Student Info: ");
    }
  }