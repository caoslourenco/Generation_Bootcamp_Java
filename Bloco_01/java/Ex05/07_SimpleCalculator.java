import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation code (1: Addition, 2: Subtraction, 3: Multiplication, 4: Division): ");
        int operation = scanner.nextInt();

        double result;
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation code!");
        }
    }
}