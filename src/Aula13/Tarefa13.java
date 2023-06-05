package Aula13;

import java.util.Random;
import java.util.Scanner;

/*
Escreva  um  programa  que  leia  uma  matriz  de  ordem  3  de  números 
inteiros e mostre a matriz. Na sequência calcule e mostre:  
a) a soma dos elementos pares da matriz; 
b) a média de todos os elementos da matriz; 
c) a quantidade de elementos ímpares da matriz
*/
public class Tarefa13 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int somaPares = 0;
        int somaTotal = 0;
        int quantidadeElementos = 0;
        int quantidadeImpares = 0;
        
        // Criar a matriz 3x3
        int[][] matriz = new int[3][3];

        // Ler os elementos da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(100);
            }
        }

        // Exibir a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] % 2 == 0) {
                    somaPares += matriz[i][j];
                }
                else {
                    quantidadeImpares++;
                }
                
                somaTotal += matriz[i][j];
                quantidadeElementos++;
            }
            System.out.println();
        }

        System.out.println("Soma dos elementos pares: " + somaPares);
        double media = (double) somaTotal / quantidadeElementos;
        System.out.println("Média de todos os elementos: " + media);
        System.out.println("Quantidade de elementos ímpares: " + quantidadeImpares);

    }
}
