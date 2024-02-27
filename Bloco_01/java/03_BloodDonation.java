import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the donor's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the donor's age: ");
        int age = scanner.nextInt();

        System.out.print("First blood donation? (true/false): ");
        boolean isFirstDonation = scanner.nextBoolean();

        boolean isEligible = (age >= 18 && age <= 69) && !(age >= 60 && age <= 69 && isFirstDonation);

        System.out.println(name + (isEligible ? " is eligible " : " is not eligible ") + "to donate blood!");
    }
}