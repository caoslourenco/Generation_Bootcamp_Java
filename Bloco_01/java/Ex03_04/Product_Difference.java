package JavaOperators;

import java.util.Scanner;
import java.util.Locale;

public class ProductDifference {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner input = new Scanner(System.in);
        
        float num1, num2, num3, num4, result;
        
        System.out.print("First value: ");
        num1 = input.nextFloat();
        
        System.out.print("Second value: ");
        num2 = input.nextFloat();
        
        System.out.print("Third value: ");
        num3 = input.nextFloat();
        
        System.out.print("Fourth value: ");
        num4 = input.nextFloat();
        
        result = (num1 * num2) - (num3 * num4);
        
        System.out.printf("Result: %.2f", result);

    }
}
