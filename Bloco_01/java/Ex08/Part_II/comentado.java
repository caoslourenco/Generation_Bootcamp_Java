import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankCustomersQueue {

    public static void main(String[] args) {
        // Criando uma fila usando LinkedList
        Queue<String> queue = new LinkedList<>();
        // Criando um scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            // Menu de opções
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
                    // Adicionando o cliente na fila
                    queue.add(cliente);
                    System.out.println("Cliente adicionado!");
                    break;
                case 2:
                    System.out.println("\nFila:");
                    // Exibindo todos os clientes na fila
                    for (String c : queue) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    // Verificando se a fila está vazia antes de chamar um cliente
                    if (queue.isEmpty()) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        // Retirando e exibindo o cliente chamado
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

import java.util.Scanner;
import java.util.Stack;

public class BookWithdrawalStack {

    public static void main(String[] args) {
        // Criando uma pilha usando Stack
        Stack<String> stack = new Stack<>();
        // Criando um scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            // Menu de opções
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros na pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Sair");

            System.out.print("\nDigite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String livro = scanner.nextLine();
                    // Adicionando o livro na pilha
                    stack.push(livro);
                    System.out.println("Livro adicionado!");
                    break;
                case 2:
                    System.out.println("\nPilha:");
                    // Exibindo todos os livros na pilha
                    for (String l : stack) {
                        System.out.println(l);
                    }
                    break;
                case 3:
                    // Verificando se a pilha está vazia antes de retirar um livro
                    if (stack.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        // Retirando e exibindo o livro retirado
                        String retirado = stack.pop();
                        System.out.println("O livro " + retirado + " foi retirado da pilha!");
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
