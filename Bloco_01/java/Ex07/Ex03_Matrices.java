// Exercise03_Matrices.java
import java.util.Scanner;

public class Exercise03_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        System.out.println("Enter elements of the 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elements of the main diagonal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        System.out.println("Elements of the secondary diagonal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][2 - i] + " ");
        }
        System.out.println();

        int sumMainDiagonal = 0;
        int sumSecondaryDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            sumMainDiagonal += matrix[i][i];
            sumSecondaryDiagonal += matrix[i][2 - i];
        }

        System.out.println("Sum of the main diagonal: " + sumMainDiagonal);
        System.out.println("Sum of the secondary diagonal: " + sumSecondaryDiagonal);
    }
}
