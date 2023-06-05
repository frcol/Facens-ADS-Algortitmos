package Aula13;

import java.util.Scanner;

/*
Escreva um algoritmo que: 
a)  leia um vetor A de 12 números reais;  
b)  construa e imprima um vetor B formado da seguinte maneira:  
   - os elementos de índice par são os correspondentes de A divididos por 2;  
   - os elementos de índice ímpar são os correspondentes de A multiplicados por 3. 
*/
public class Tarefa8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] vetorA = new double[12];
        double[] vetorB = new double[12];
        
        // Ler os elementos do vetor A
        System.out.println("Digite os 12 números do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextDouble();
        }
        
        // Construir o vetor B de acordo com as regras
        for (int i = 0; i < vetorB.length; i++) {
            if (i % 2 == 0) {
                vetorB[i] = vetorA[i] / 2;
            } else {
                vetorB[i] = vetorA[i] * 3;
            }
        }
        
        // Imprimir o vetor B
        System.out.println("Vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
