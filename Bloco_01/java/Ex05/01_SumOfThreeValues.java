import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number A: ");
        int A = scanner.nextInt();

        System.out.print("Enter number B: ");
        int B = scanner.nextInt();

        System.out.print("Enter number C: ");
        int C = scanner.nextInt();

        int sum = A + B;

        System.out.println(A + " + " + B + " = " + sum + (sum > C ? " > " : sum < C ? " < " : " = ") + C);

        if (sum > C) {
            System.out.println("The sum of A + B is Greater than C");
        } else if (sum < C) {
            System.out.println("The sum of A + B is Less than C");
        } else {
            System.out.println("The sum of A + B is Equal to C");
        }
    }
}


---------------------
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que permite a leitura de entrada do usuário

public class Main { // Declaração da classe Main
    public static void main(String[] args) { // Declaração do método main
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para receber entrada do usuário

        System.out.print("Enter number A: "); // Solicita ao usuário que insira o número A
        int A = scanner.nextInt(); // Lê o valor inserido pelo usuário e armazena na variável A

        System.out.print("Enter number B: "); // Solicita ao usuário que insira o número B
        int B = scanner.nextInt(); // Lê o valor inserido pelo usuário e armazena na variável B

        System.out.print("Enter number C: "); // Solicita ao usuário que insira o número C
        int C = scanner.nextInt(); // Lê o valor inserido pelo usuário e armazena na variável C

        int sum = A + B; // Calcula a soma de A e B e armazena na variável sum

        // Imprime a expressão da soma e comparação com C
        System.out.println(A + " + " + B + " = " + sum + (sum > C ? " > " : sum < C ? " < " : " = ") + C);

        // Verifica se a soma é maior que C
        if (sum > C) {
            System.out.println("The sum of A + B is Greater than C"); // Imprime que a soma de A + B é maior que C
        } else if (sum < C) { // Verifica se a soma é menor que C
            System.out.println("The sum of A + B is Less than C"); // Imprime que a soma de A + B é menor que C
        } else { // Se não for nem maior nem menor, então é igual
            System.out.println("The sum of A + B is Equal to C"); // Imprime que a soma de A + B é igual a C
        }
    }
}
