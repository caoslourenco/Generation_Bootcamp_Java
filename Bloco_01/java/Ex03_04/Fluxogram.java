package JavaOperators;

import java.util.Scanner;

public class SalaryBonus {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float salary, bonus, newSalary;
        
        System.out.print("Enter the salary: ");
        salary = input.nextFloat();
        
        System.out.print("Enter the bonus: ");
        bonus = input.nextFloat();
        
        newSalary = salary + bonus;
        
        System.out.println("New salary: $" + String.format("%.02f", newSalary));
        
    }
    
}
