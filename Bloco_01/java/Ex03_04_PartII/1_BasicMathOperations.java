package JavaOperators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Leitura dos valores inteiros A e B
        int A = in.nextInt();
        int B = in.nextInt();
        
        // Cálculo da soma, diferença, multiplicação e divisão
        int sum = A + B;
        int difference = A - B;
        int multiplication = A * B;
        double division = (double) A / B; // Convertendo para double para obter o resultado com precisão
        
        // Exibição dos resultados
        System.out.println("Soma: " + sum);
        System.out.println("Diferença: " + difference);
        System.out.println("Multiplicação: " + multiplication);
        System.out.printf("Divisão: %.3f%n", division); // Formatando para exibir apenas 3 casas decimais
    }
}

