import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the donor's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the donor's age: ");
        int age = scanner.nextInt();

        System.out.print("First blood donation? (true/false): ");
        boolean isFirstDonation = scanner.nextBoolean();

        boolean isEligible = (age >= 18 && age <= 69) && !(age >= 60 && age <= 69 && isFirstDonation);

        System.out.println(name + (isEligible ? " is eligible " : " is not eligible ") + "to donate blood!");
    }
}


------------------------
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que permite a leitura de entrada do usuário

public class Main { // Declaração da classe Main
    public static void main(String[] args) { // Declaração do método main
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para receber entrada do usuário

        System.out.print("Enter the donor's name: "); // Solicita ao usuário que insira o nome do doador
        String name = scanner.nextLine(); // Lê o nome inserido pelo usuário e armazena na variável name

        System.out.print("Enter the donor's age: "); // Solicita ao usuário que insira a idade do doador
        int age = scanner.nextInt(); // Lê a idade inserida pelo usuário e armazena na variável age

        System.out.print("First blood donation? (true/false): "); // Solicita ao usuário que informe se é a primeira doação de sangue
        boolean isFirstDonation = scanner.nextBoolean(); // Lê a resposta inserida pelo usuário e armazena na variável isFirstDonation

        // Determina se o doador é elegível para doar sangue baseado na idade e se é a primeira doação
        boolean isEligible = (age >= 18 && age <= 69) && !(age >= 60 && age <= 69 && isFirstDonation);

        // Imprime uma mensagem informando se o doador é elegível ou não para doar sangue
        System.out.println(name + (isEligible ? " is eligible " : " is not eligible ") + "to donate blood!");
    }
}
