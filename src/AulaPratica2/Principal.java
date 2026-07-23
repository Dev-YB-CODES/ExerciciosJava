package AulaPratica2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as três notas do aluno:");
        
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite os pesos das três notas do aluno:");

        double peso1 = scanner2.nextDouble();
        double peso2 = scanner2.nextDouble();
        double peso3 = scanner2.nextDouble();

        Avaliacao avaliacao = new Avaliacao(nota1, nota2, nota3, peso1, peso2, peso3);
        
        double mediaAritmetica = avaliacao.calcularMediaAritmetica();
        double mediaPonderada = avaliacao.calcularMediaPonderada();

        System.out.printf("Média Aritmética: %.2f\n", mediaAritmetica);
        System.out.printf("Média Ponderada: %.2f\n", mediaPonderada);
    }

}
