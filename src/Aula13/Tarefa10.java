package Aula13;

import java.util.Scanner;

/*
Escreva um algoritmo que leia um vetor de n elementos inteiros. 
Ordene o vetor em ordem decrescente e exiba-o. 
*/
public class Tarefa10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];

        // Ler os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Ordenar o vetor em ordem decrescente
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (vetor[i] < vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        // Exibir o vetor em ordem decrescente
        System.out.println("Vetor em ordem decrescente:");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
