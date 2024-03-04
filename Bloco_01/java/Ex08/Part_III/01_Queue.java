import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1: Add a new client to the queue");
            System.out.println("2: List all clients in the queue");
            System.out.println("3: Call (remove) a person from the queue");
            System.out.println("0: Exit");

            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (option) {
                case 1:
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();
                    queue.add(name);
                    System.out.println("Client Added!");
                    break;
                case 2:
                    System.out.println("Queue:");
                    for (String client : queue) {
                        System.out.println(client);
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("The Queue is empty!");
                    } else {
                        String removedClient = queue.poll();
                        System.out.println("The Client was Called: " + removedClient);
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
