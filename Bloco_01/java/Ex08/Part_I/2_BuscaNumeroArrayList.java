import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

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
            System.out.println("\nO número " + numero + " está localizado na posição: " + numeros.indexOf(numero));
        } else {
            System.out.println("\nO número " + numero + " não foi encontrado!");
        }

        scanner.close();
    }
}
