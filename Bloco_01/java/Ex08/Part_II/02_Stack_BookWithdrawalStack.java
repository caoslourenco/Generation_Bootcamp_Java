import java.util.Scanner;
import java.util.Stack;

public class BookWithdrawalStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
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
                    stack.push(livro);
                    System.out.println("Livro adicionado!");
                    break;
                case 2:
                    System.out.println("\nPilha:");
                    for (String l : stack) {
                        System.out.println(l);
                    }
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
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
