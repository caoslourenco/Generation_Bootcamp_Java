// 02_Exercicio02_Lista01.java
import java.util.Scanner;

public class Exercicio02_Lista01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerosPares = 0;
        int numerosImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("Total de números pares: " + numerosPares);
        System.out.println("Total de números ímpares: " + numerosImpares);

        scanner.close();
    }
}
