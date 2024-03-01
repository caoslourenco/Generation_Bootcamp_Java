import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2HashSet {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nList:");
        for (Integer num : numeros) {
            System.out.println(num);
        }

        System.out.println("\nDigite o número que você deseja encontrar:");
        int numero = scanner.nextInt();

        if (numeros.contains(numero)) {
            System.out.println("\nO número " + numero + " foi encontrado!");
        } else {
            System.out.println("\nO número " + numero + " não foi encontrado!");
        }

        scanner.close();
    }
}
