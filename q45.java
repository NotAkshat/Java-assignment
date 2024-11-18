import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double basicSalary;

    Employee(int id, String name, double salary) {
        empId = id;
        empName = name;
        basicSalary = salary;
    }

    double calculateGrossSalary() {
        double grossSalary = basicSalary + (0.4 * basicSalary) + (0.2 * basicSalary);  // HRA + DA
        return grossSalary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class q45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.display();
    }
}
