import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1: Add a new book to the stack");
            System.out.println("2: List all books in the stack");
            System.out.println("3: Remove a book from the stack");
            System.out.println("0: Exit");

            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (option) {
                case 1:
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();
                    stack.push(name);
                    System.out.println("Book Added!");
                    break;
                case 2:
                    System.out.println("Stack:");
                    for (int i = stack.size() - 1; i >= 0; i--) {
                        System.out.println(stack.get(i));
                    }
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("The Stack is empty!");
                    } else {
                        String removedBook = stack.pop();
                        System.out.println("A Book was removed from the stack: " + removedBook);
                    }
                    break;
                case 0:
                    System.out.println("Program Terminated!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
