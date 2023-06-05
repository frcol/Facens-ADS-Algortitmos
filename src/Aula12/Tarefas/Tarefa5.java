package Aula12.Tarefas;

import java.util.Random;
import java.util.Scanner;

/*
Faça um programa que recebe uma matriz 3x4 e mostra a média dos elementos de uma
linha escolhida pelo usuário
*/

public class Tarefa5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int soma = 0;
        
        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Escolha uma linha [1 a "+matriz.length+"]");
        int opt = scan.nextInt()-1;
        
        for (int j = 0; j < matriz[opt].length; j++) {
            soma += matriz[opt][j];
        }
        
        System.out.println("Soma: "+soma);
    }
}
