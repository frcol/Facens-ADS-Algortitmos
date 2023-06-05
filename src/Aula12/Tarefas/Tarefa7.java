package Aula12.Tarefas;

import java.util.Random;

/*
Faça um programa que leia uma matriz 5x5 de inteiros e some os elementos de cada
coluna da matriz. Mostre a matriz original, o índice das coluna e a soma de cada uma delas
*/

public class Tarefa7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[5][5];
        int soma = 0;
        
        // Cria Matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        
        // Mostra matriz
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Mostra colunas e soma
        System.out.println();
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            soma = 0;
            System.out.print("Coluna "+coluna+": ");
            for (int linha = 0; linha < matriz.length; linha++) {
                soma += matriz[linha][coluna];
            }
            System.out.println(soma);
        }
    }
}
