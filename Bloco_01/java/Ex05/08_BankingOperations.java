import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float balance = 1000.0f;

        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your current balance: $" + balance);
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: $");
                float withdrawAmount = scanner.nextFloat();
                if (withdrawAmount > balance) {
                    System.out.println("Insufficient funds!");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful! New balance: $" + balance);
                }
                break;
            case 3:
                System.out.print("Enter the amount to deposit: $");
                float depositAmount = scanner.nextFloat();
                balance += depositAmount;
                System.out.println("Deposit successful! New balance: $" + balance);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}