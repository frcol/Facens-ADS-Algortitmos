package Aula13;

import java.util.Random;
import java.util.Scanner;

/*
Escreva  um  programa  que  leia  uma  matriz  4x5  de  n�meros  inteiros  e  a exiba. 
Leia a seguir um n�mero e verifique se esse n�mero lido est� ou n�o  na  matriz.  
Se  estiver,  escrever  uma  mensagem  dizendo  que  o n�mero est� na matriz e em 
quais posi��es (linha e coluna) da matriz ele se encontra. 
*/
public class Tarefa14 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        // Criar a matriz 4x5
        int[][] matriz = new int[4][5];

        // Ler os elementos da matriz
        System.out.println("Digite os elementos da matriz 4x5:");
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
            }
            System.out.println();
        }

        // Ler o n�mero a ser verificado
        System.out.println("Digite um n�mero para verificar:");
        double numero = scanner.nextDouble();

        // Verificar se o n�mero est� presente na matriz
        boolean encontrado = false;
        String posicoes = "";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == numero) {
                    encontrado = true;
                    posicoes += "(" + i + ", " + j + ") ";
                }
            }
        }

        // Exibir o resultado da verifica��o
        if (encontrado) {
            System.out.println("O n�mero " + numero + " est� presente na matriz nas posi��es: " + posicoes);
        } else {
            System.out.println("O n�mero " + numero + " n�o est� presente na matriz.");
        }
    }
}
