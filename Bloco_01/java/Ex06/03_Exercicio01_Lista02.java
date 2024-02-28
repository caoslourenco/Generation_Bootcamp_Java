// 03_Exercicio01_Lista02.java
import java.util.Scanner;

public class Exercicio01_Lista02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMenores21 = 0;
        int totalMaiores50 = 0;

        System.out.println("Digite uma idade: ");
        int idade = scanner.nextInt();

        while (idade >= 0) {
            if (idade < 21) {
                totalMenores21++;
            }
            if (idade > 50) {
                totalMaiores50++;
            }
            System.out.println("Digite uma idade: ");
            idade = scanner.nextInt();
        }

        System.out.println("Total de pessoas menores de 21 anos: " + totalMenores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + totalMaiores50);

        scanner.close();
    }
}
