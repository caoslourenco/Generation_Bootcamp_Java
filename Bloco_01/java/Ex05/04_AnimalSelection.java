import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the characteristics of an animal (vertebrate/invertebrate, mammal/insect, omnivorous/herbivorous): ");
        String characteristic1 = scanner.next();
        String characteristic2 = scanner.next();
        String characteristic3 = scanner.next();

        String animal;

        if (characteristic1.equals("vertebrate") && characteristic2.equals("mammal") && characteristic3.equals("omnivorous")) {
            animal = "Human";
        } else if (characteristic1.equals("invertebrate") && characteristic2.equals("insect") && characteristic3.equals("herbivorous")) {
            animal = "Caterpillar";
        } else {
            animal = "Unknown";
        }

        System.out.println("The selected animal is: " + animal);
    }
}


---------------
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que permite a leitura de entrada do usuário

public class Main { // Declaração da classe Main
    public static void main(String[] args) { // Declaração do método main
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para receber entrada do usuário

        System.out.print("Enter the characteristics of an animal (vertebrate/invertebrate, mammal/insect, omnivorous/herbivorous): "); // Solicita ao usuário que insira as características de um animal
        String characteristic1 = scanner.next(); // Lê a primeira característica inserida pelo usuário e armazena na variável characteristic1
        String characteristic2 = scanner.next(); // Lê a segunda característica inserida pelo usuário e armazena na variável characteristic2
        String characteristic3 = scanner.next(); // Lê a terceira característica inserida pelo usuário e armazena na variável characteristic3

        String animal; // Declaração da variável animal

        // Verifica as características inseridas e determina o animal correspondente
        if (characteristic1.equals("vertebrate") && characteristic2.equals("mammal") && characteristic3.equals("omnivorous")) {
            animal = "Human"; // Se as características correspondem a um humano
        } else if (characteristic1.equals("invertebrate") && characteristic2.equals("insect") && characteristic3.equals("herbivorous")) {
            animal = "Caterpillar"; // Se as características correspondem a uma lagarta
        } else {
            animal = "Unknown"; // Se as características não correspondem a nenhum animal conhecido
        }

        // Imprime o animal selecionado com base nas características inseridas pelo usuário
        System.out.println("The selected animal is: " + animal);
    }
}
