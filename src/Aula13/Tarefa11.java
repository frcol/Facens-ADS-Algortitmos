package Aula13;

import java.util.Scanner;

/*
Faça  um  programa  que  recebe  uma  matriz  4x4  e  realiza  as  seguintes 
operações: 
-  Exibir a soma dos elementos da diagonal principal. 
-  Colocar  os  elementos  da  diagonal  principal  em  um  vetor  (uma dimensão). 
-  Exibir o vetor.
*/
public class Tarefa11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int somaDiagonal = 0;
        int[] vetorDiagonal = new int[4];
        
        // Ler os elementos da matriz
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < vetorDiagonal.length; i++) {
            vetorDiagonal[i] = matriz[i][i];
            somaDiagonal += matriz[i][i];
        }
        

        System.out.println("Soma da diagonal principal: " + somaDiagonal);
        System.out.println("Vetor com os elementos da diagonal principal:");
        for (int i = 0; i < vetorDiagonal.length; i++) {
            System.out.print(vetorDiagonal[i] + " ");
        }
    }
}
