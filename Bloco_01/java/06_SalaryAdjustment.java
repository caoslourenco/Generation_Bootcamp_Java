import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the employee's job code (1 to 6): ");
        int jobCode = scanner.nextInt();

        System.out.print("Enter the employee's salary: R$ ");
        double salary = scanner.nextDouble();

        double newSalary;

        switch (jobCode) {
            case 1:
                newSalary = salary * 1.10; // 10% increase for manager
                System.out.println("Employee: " + name + "\nJob: Manager\nNew Salary: R$ " + newSalary);
                break;
            case 2:
                newSalary = salary * 1.07; // 7% increase for salesman
                System.out.println("Employee: " + name + "\nJob: Salesman\nNew Salary: R$ " + newSalary);
                break;
            case 3:
                newSalary = salary * 1.09; // 9% increase for supervisor
                System.out.println("Employee: " + name + "\nJob: Supervisor\nNew Salary: R$ " + newSalary);
                break;
            case 4:
                newSalary = salary * 1.06; // 6% increase for driver
                System.out.println("Employee: " + name + "\nJob: Driver\nNew Salary: R$ " + newSalary);
                break;
            case 5:
                newSalary = salary * 1.05; // 5% increase for stocker
                System.out.println("Employee: " + name + "\nJob: Stocker\nNew Salary: R$ " + newSalary);
                break;
            case 6:
                newSalary = salary * 1.08; // 8% increase for IT technician
                System.out.println("Employee: " + name + "\nJob: IT Technician\nNew Salary: R$ " + newSalary);
                break;
            default:
                System.out.println("Invalid job code!");
        }
    }
}
