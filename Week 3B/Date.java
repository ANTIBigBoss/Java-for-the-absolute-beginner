//Class called date that includes three instance variables a month, a day, and a year based on user input it then prints them out
public class Date
{
  // Instance variables
  private int month;
  private int day;
  private int year;
  
  // Constructor
  public Date()
  {
    month = 0;
    day = 0;
    year = 0;
  }
  
  // Constructor
public Date(int month, int day, int year)
  {
    this.month = month;
    this.day = day;
    this.year = year;
  }
  
  // Method to set the month
  public void setMonth(int month)
  {
    this.month = month;
  }
  
  // Method to set the day
  public void setDay(int day)
  {
    this.day = day;
  }
  
  // Method to set the year
    public void setYear(int year)
  {
    this.year = year;
  }
  
  // Method to get the month
  public int getMonth()
  {
    return month;
  }
  
  // Method to get the day
  public int getDay()
  {
    return day;
  }
  
  // Method to get the year
  public int getYear()
  {
    return year;
  }
  
  // Method to print the date
  public void printDate()
  {
    System.out.println("Month: " + month + " Day: " + day + " Year: " + year);
  }
}