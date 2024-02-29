// Exercise01_Vectors.java
import java.util.Scanner;

public class Exercise01_Vectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        System.out.println("Enter the number you want to find: ");
        int number = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == number) {
                System.out.println("The number " + number + " is located at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The number " + number + " was not found!");
        }
    }
}
