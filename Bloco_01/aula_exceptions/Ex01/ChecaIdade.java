package aula_exceptions;

import java.util.Scanner;

public class ChecaIdade {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        int idade;

        System.out.println("\nDigite uma idade: ");
        idade = leia.nextInt();

        try {
            validarIdade(idade);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Parece que você está tentando inserir algo ainda em fase de desenvolvimento... Tente novamente daqui uns anos!");
        }

    }

    public static void validarIdade(int idade) {
        if (idade <= 0) {
            throw new ArithmeticException("Você não é um humano ainda é?");
        } else if (idade < 18) {
            System.out.println("A Pessoa não pode dirigir, é menor de idade!!");
            System.out.println("Mas hey, pelo menos ela pode andar de bicicleta com rodinhas!");
        } else {
            System.out.println("A Pessoa pode dirigir!!");
            System.out.println("Cuidado nas curvas, afinal, a vida não é um videogame e você só tem uma vida!");
        }
    }
}
