import java.util.Scanner;

class StudentAdmission {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        System.out.print("Enter Student Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);

        sc.close();
    }
}