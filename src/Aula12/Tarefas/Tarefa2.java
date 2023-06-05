package Aula12.Tarefas;

/*
Fa�a um programa que recebe uma matriz 3x4 e mostra a soma dos seus elementos.
*/

public class Tarefa2 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][3];
        int numero = 0;
        int soma = 0;
        
        // Preenchendo a matriz com n�meros inteiros crescentes
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero;
                soma += numero;
                numero++;
            }
        }
        
        // Imprimindo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Soma: "+soma);
    }
}
