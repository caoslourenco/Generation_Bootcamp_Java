// 05_Exercicio01_Lista03.java
import java.util.Scanner;

public class Exercicio01_Lista03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaPositivos = 0;

        int numero;
        do {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if (numero > 0) {
                somaPositivos += numero;
            }
        } while (numero != 0);

        System.out.println("A soma dos números positivos é: " + somaPositivos);

        scanner.close();
    }
}
