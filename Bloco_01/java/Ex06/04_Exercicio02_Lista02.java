// 04_Exercicio02_Lista02.java
import java.util.Scanner;

public class Exercicio02_Lista02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBackend = 0;
        int totalFrontendMulheres = 0;
        int totalMobileHomensMaiores40 = 0;
        int totalFullStackNaoBinariosMenores30 = 0;
        int totalColaboradores = 0;
        int somaIdades = 0;

        char continuar;

        do {
            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            System.out.println("Identidade de Gênero (1 a 6): ");
            int identidadeGenero = scanner.nextInt();
            System.out.println("Pessoa Desenvolvedora (1 a 4): ");
            int pessoaDesenvolvedora = scanner.nextInt();

            if (pessoaDesenvolvedora == 1) {
                totalBackend++;
            } else if (pessoaDesenvolvedora == 2 && (identidadeGenero == 1 || identidadeGenero == 4)) {
                totalFrontendMulheres++;
            } else if (pessoaDesenvolvedora == 3 && identidadeGenero <= 2 && idade > 40) {
                totalMobileHomensMaiores40++;
            } else if (pessoaDesenvolvedora == 4 && identidadeGenero == 3 && idade < 30) {
                totalFullStackNaoBinariosMenores30++;
            }

            totalColaboradores++;
            somaIdades += idade;

            System.out.println("Deseja continuar (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        System.out.println("Total de pessoas desenvolvedoras Backend: " + totalBackend);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalFrontendMulheres);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalMobileHomensMaiores40);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + totalFullStackNaoBinariosMenores30);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalColaboradores);
        System.out.println("A média de idade das pessoas que responderam à pesquisa: " + (float) somaIdades / totalColaboradores);

        scanner.close();
    }
}
