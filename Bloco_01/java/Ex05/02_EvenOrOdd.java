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


--------------------
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que permite a leitura de entrada do usuário

public class Main { // Declaração da classe Main
    public static void main(String[] args) { // Declaração do método main
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para receber entrada do usuário

        System.out.print("Enter a number: "); // Solicita ao usuário que insira um número
        int number = scanner.nextInt(); // Lê o número inserido pelo usuário e armazena na variável number

        // Determina se o número é par ou ímpar usando o operador ternário
        String parity = number % 2 == 0 ? "even" : "odd";
        // Determina se o número é positivo ou negativo usando o operador ternário
        String sign = number >= 0 ? "positive" : "negative";

        // Imprime a mensagem informando se o número é par ou ímpar e positivo ou negativo
        System.out.println("The Number " + number + " is " + parity + " and " + sign + "!");
    }
}
