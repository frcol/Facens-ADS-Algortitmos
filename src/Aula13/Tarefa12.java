package Aula13;

import java.util.Random;
import java.util.Scanner;

/*
Leia duas matrizes 4x4 e escreva uma terceira com os maiores elementos de cada 
posição. 
*/
public class Tarefa12 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        // Criar as matrizes 4x4
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = rnd.nextInt(100);
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = rnd.nextInt(100);
            }
        }

        // Criar a terceira matriz para armazenar os maiores elementos
        int[][] matrizMaior = new int[4][4];

        // Encontrar os maiores elementos de cada posição e preencher a terceira matriz
        for (int i = 0; i < matrizMaior.length; i++) {
            for (int j = 0; j < matrizMaior[i].length; j++) {
                matrizMaior[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);
            }
        }

        System.out.println("Primeira matriz:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Segunda matriz:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Terceira matriz com os maiores elementos:");
        for (int i = 0; i < matrizMaior.length; i++) {
            for (int j = 0; j < matrizMaior[i].length; j++) {
                System.out.print(matrizMaior[i][j] + " ");
            }
            System.out.println();
        }
    }
}
