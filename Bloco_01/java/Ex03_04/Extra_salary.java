package JavaOperators;

import java.util.Scanner;

public class ExtraSalary {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float grossSalary, nightAllowance, extraHours, deductions, netSalary;
        
        System.out.print("Gross salary: ");
        grossSalary = validateInput(input);
        
        System.out.print("Night shift allowance: ");
        nightAllowance = validateInput(input);
        
        System.out.print("Extra hours: ");
        extraHours = validateInput(input);
        
        System.out.print("Deductions: ");
        deductions = validateInput(input);
        
        netSalary = grossSalary + nightAllowance + (extraHours * 5) - deductions;
        
        System.out.print("Net salary: " + String.format("%.02f", netSalary));
        
    }

    // Function to validate input as a float
    public static float validateInput(Scanner input) {
        float value;
        while (true) {
            try {
                value = input.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                input.nextLine(); // Clear the input buffer
            }
        }
        return value;
    }
}
