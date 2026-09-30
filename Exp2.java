abstract class Employee {

    static String company = "ABC Technologies";

    protected String department;
    private double salary;
    protected String designation;
    String location;

    Employee(String department, double salary,
             String designation, String location) {

        this.department = department;
        this.salary = salary;
        this.designation = designation;
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayRole() {
        System.out.println("Company: " + company);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("Location: " + location);
    }

    abstract void displayRoleDetails();
}


class Developer extends Employee {

    Developer(String department, double salary,
              String designation, String location) {

        super(department, salary, designation, location);
    }

    @Override
    void displayRoleDetails() {
        System.out.println("Role: Software Developer");
    }
}


public class Exp2 {

    public static void main(String[] args) {

        Developer emp = new Developer(
            "Development",
            100000,
            "Software Engineer",
            "Chennai"
        );

        emp.displayRole();

        emp.displayRoleDetails();

        System.out.println("Employee Salary: " + emp.getSalary());

        emp.setSalary(120000);

        System.out.println("Updated Salary: " + emp.getSalary());
    }
}