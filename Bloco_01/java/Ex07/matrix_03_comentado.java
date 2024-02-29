import java.util.Scanner;

public class Exercise03_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        int[][] matrix = new int[3][3]; // Declara uma matriz de inteiros 3x3
        System.out.println("Enter elements of the 3x3 matrix:"); // Solicita ao usuário para inserir os elementos da matriz

        // Loop para preencher a matriz com os elementos inseridos pelo usuário
        for (int i = 0; i < 3; i++) { // Loop para linhas
            for (int j = 0; j < 3; j++) { // Loop para colunas
                matrix[i][j] = scanner.nextInt(); // Lê o próximo número inteiro inserido pelo usuário e o atribui à matriz
            }
        }

        System.out.println("Elements of the main diagonal: "); // Imprime os elementos da diagonal principal
        for (int i = 0; i < 3; i++) { // Loop para percorrer a diagonal principal
            System.out.print(matrix[i][i] + " "); // Imprime os elementos da diagonal principal
        }
        System.out.println();

        System.out.println("Elements of the secondary diagonal: "); // Imprime os elementos da diagonal secundária
        for (int i = 0; i < 3; i++) { // Loop para percorrer a diagonal secundária
            System.out.print(matrix[i][2 - i] + " "); // Imprime os elementos da diagonal secundária
        }
        System.out.println();

        int sumMainDiagonal = 0; // Variável para armazenar a soma dos elementos da diagonal principal
        int sumSecondaryDiagonal = 0; // Variável para armazenar a soma dos elementos da diagonal secundária
        for (int i = 0; i < 3; i++) { // Loop para percorrer as linhas
            sumMainDiagonal += matrix[i][i]; // Adiciona o elemento da diagonal principal à somaMainDiagonal
            sumSecondaryDiagonal += matrix[i][2 - i]; // Adiciona o elemento da diagonal secundária à somaSecondaryDiagonal
        }

        System.out.println("Sum of the main diagonal: " + sumMainDiagonal); // Imprime a soma da diagonal principal
        System.out.println("Sum of the secondary diagonal: " + sumSecondaryDiagonal); // Imprime a soma da diagonal secundária
    }
}
