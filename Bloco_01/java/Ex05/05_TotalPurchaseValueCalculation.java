import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalValue = 0;

        System.out.print("Enter the product code (1 to 6): ");
        int productCode = scanner.nextInt();

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        switch (productCode) {
            case 1:
                totalValue = quantity * 10.00;
                System.out.println("Product: Hot Dog");
                break;
            case 2:
                totalValue = quantity * 15.00;
                System.out.println("Product: X-Salad");
                break;
            case 3:
                totalValue = quantity * 18.00;
                System.out.println("Product: X-Bacon");
                break;
            case 4:
                totalValue = quantity * 12.00;
                System.out.println("Product: Bauru");
                break;
            case 5:
                totalValue = quantity * 8.00;
                System.out.println("Product: Soda");
                break;
            case 6:
                totalValue = quantity * 13.00;
                System.out.println("Product: Orange Juice");
                break;
            default:
                System.out.println("Invalid product code!");
        }

        System.out.println("Total Value: R$ " + totalValue);
    }
}