// 01_Exercicio01_Lista01.java
import java.util.Scanner;

public class Exercicio01_Lista01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número do intervalo: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o último número do intervalo: ");
        int ultimoNumero = scanner.nextInt();

        if (primeiroNumero >= ultimoNumero) {
            System.out.println("Intervalo inválido!");
            return;
        }

        System.out.println("No intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");
        for (int i = primeiroNumero; i <= ultimoNumero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }

        scanner.close();
    }
}
