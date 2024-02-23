package JavaOperators;
import java.util.Scanner;

public class ParticipantAverage {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float grade1, grade2, grade3, grade4, average;
        
        System.out.print("Enter the first grade: ");
        grade1 = validateInput(input);
        
        System.out.print("Enter the second grade: ");
        grade2 = validateInput(input);
        
        System.out.print("Enter the third grade: ");
        grade3 = validateInput(input);
        
        System.out.print("Enter the fourth grade: ");
        grade4 = validateInput(input);
        
        average = (grade1 + grade2 + grade3 + grade4) / 4;
        
        System.out.println("Average: " + String.format("%.02f", average));
        
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
