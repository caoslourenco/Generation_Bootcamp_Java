// 06_Exercicio02_Lista03.java
import java.util.Scanner;

public class Exercicio02_Lista03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaMultiplos3 = 0;
        int countMultiplos3 = 0;

        int numero;
        do {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if (numero % 3 == 0 && numero != 0) {
                somaMultiplos3 += numero;
                countMultiplos3++;
            }
        } while (numero != 0);

        if (countMultiplos3 > 0) {
            System.out.println("A média de todos os números múltiplos de 3 é: " + (float) somaMultiplos3 / countMultiplos3);
        } else {
            System.out.println("Não foram digitados números múltiplos de 3.");
        }

        scanner.close();
    }
}
