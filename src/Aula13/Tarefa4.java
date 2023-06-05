package Aula13;

import java.util.Scanner;

/*
Para 5 alunos da turma de Algoritmos e Programação, receber a média de teoria 
e a média de laboratório, calcular a média final (final = teoria * 0.6 + 
laboratório * 0.4) e informar se cada um foi bem (final >= 7), razoável 
(5 <= final < 7) ou mal (final < 5). 
*/
public class Tarefa4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAlunos = 5;
        
        double[] mediasTeoria = new double[numeroAlunos];
        double[] mediasLaboratorio = new double[numeroAlunos];
        double[] mediasFinais = new double[numeroAlunos];
        
        // Obter as médias de teoria e laboratório para cada aluno
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Digite a média de teoria do aluno " + (i + 1) + ": ");
            mediasTeoria[i] = scanner.nextDouble();
            
            System.out.print("Digite a média de laboratório do aluno " + (i + 1) + ": ");
            mediasLaboratorio[i] = scanner.nextDouble();
            
            // Calcular a média final
            mediasFinais[i] = mediasTeoria[i] * 0.6 + mediasLaboratorio[i] * 0.4;
        }
        
        // Verificar a situação de cada aluno e exibir o resultado
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            
            if (mediasFinais[i] >= 7) {
                System.out.println("Bem");
            } else if (mediasFinais[i] >= 5 && mediasFinais[i] < 7) {
                System.out.println("Razoável");
            } else {
                System.out.println("Mal");
            }
        }
    }
}
