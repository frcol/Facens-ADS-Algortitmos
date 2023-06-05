package Aula12.Tarefas;

import java.util.Random;

/*
Faça um programa que recebe uma matriz 3x3 e gera uma segunda matriz com o dobro de cada
valor. No final, exiba as duas matrizes na tela
*/

public class Tarefa4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][3];
        int[][] matrizDobro = new int[3][3];

        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
                matrizDobro[i][j] = matriz[i][j]*2;
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        for (int i = 0; i < matrizDobro.length; i++) {
            for (int j = 0; j < matrizDobro[i].length; j++) {
                System.out.print(matrizDobro[i][j] + " ");
            }
            System.out.println();
        }
    }
}
