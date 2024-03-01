import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1HashSet {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros não repetidos:");

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }

        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}
