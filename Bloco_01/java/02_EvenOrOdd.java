import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String parity = number % 2 == 0 ? "even" : "odd";
        String sign = number >= 0 ? "positive" : "negative";

        System.out.println("The Number " + number + " is " + parity + " and " + sign + "!");
    }
}
