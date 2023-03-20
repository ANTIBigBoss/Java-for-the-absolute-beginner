//Public class for employee
public class Employee extends Person {

    //Salary is a double for the decimal point
    private double annualSalary;
    //Start year is an int as no decimal point needed
    private int startYear;

    public Employee(String name, double annualSalary, int startYear) {
        super(name);
        this.annualSalary = annualSalary;
        this.startYear = startYear;
    }
    //Getters and Setters for salary and start year
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }
}
