// Exercise04_Matrices.java
import java.util.Scanner;

public class Exercise04_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] grades = new double[10][4];
        double[] averages = new double[10];

        System.out.println("Enter grades of 10 students for 4 terms:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                grades[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 10; i++) {
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += grades[i][j];
            }
            averages[i] = sum / 4;
        }

        System.out.println("Average grades of each student:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + ": " + averages[i]);
        }
    }
}
