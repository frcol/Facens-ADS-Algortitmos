package Aula12.Tarefas;

import java.util.Random;

/*
Faça um programa que recebe uma matriz 5x3 e informa qual é o maior elemento dela e sua
posição
*/

public class Tarefa3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[5][3];
        int maxNum = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
                if (matriz[i][j] > maxNum) {
                    maxNum = matriz[i][j];
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Maior numero: "+maxNum);
    }
}
