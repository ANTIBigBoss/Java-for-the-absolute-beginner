//Class to test the Employee class
public class TestEmployee {
    public static void main(String[] args) {
        //Employees Rachel and Mitchell
        Employee emp1 = new Employee("Mitchell Lauzon", 80000, 2010);
        Employee emp2 = new Employee("Rachel Lauzon", 90000, 2015);
        //Print the information of Employee 1
        System.out.println("Employee 1");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Annual Salary: " + emp1.getAnnualSalary());
        System.out.println("Start Year: " + emp1.getStartYear());
        //Print the information of Employee 2
        System.out.println("\nEmployee 2");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Annual Salary: " + emp2.getAnnualSalary());
        System.out.println("Start Year: " + emp2.getStartYear());
    }
}
