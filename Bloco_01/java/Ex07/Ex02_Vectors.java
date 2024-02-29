// Exercise02_Vectors.java
import java.util.Scanner;

public class Exercise02_Vectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        System.out.println("Elements at odd indices: ");
        for (int i = 1; i < vector.length; i += 2) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        System.out.println("Even elements: ");
        for (int num : vector) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int num : vector) {
            sum += num;
        }
        double average = (double) sum / vector.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
