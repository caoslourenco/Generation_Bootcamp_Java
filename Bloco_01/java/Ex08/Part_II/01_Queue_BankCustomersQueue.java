import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankCustomersQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) uma pessoa da fila");
            System.out.println("0: Sair");

            System.out.print("\nDigite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String cliente = scanner.nextLine();
                    queue.add(cliente);
                    System.out.println("Cliente adicionado!");
                    break;
                case 2:
                    System.out.println("\nFila:");
                    for (String c : queue) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        String chamado = queue.poll();
                        System.out.println("O cliente " + chamado + " foi chamado!");
                    }
                    break;
                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
