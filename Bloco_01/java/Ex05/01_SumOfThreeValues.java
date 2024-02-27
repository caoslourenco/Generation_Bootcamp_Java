import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number A: ");
        int A = scanner.nextInt();

        System.out.print("Enter number B: ");
        int B = scanner.nextInt();

        System.out.print("Enter number C: ");
        int C = scanner.nextInt();

        int sum = A + B;

        System.out.println(A + " + " + B + " = " + sum + (sum > C ? " > " : sum < C ? " < " : " = ") + C);

        if (sum > C) {
            System.out.println("The sum of A + B is Greater than C");
        } else if (sum < C) {
            System.out.println("The sum of A + B is Less than C");
        } else {
            System.out.println("The sum of A + B is Equal to C");
        }
    }
}