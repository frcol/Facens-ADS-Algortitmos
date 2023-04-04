package Aula6_Tarefas;

// 13) Escreva um programa que leia 10 números, ao final o programa deverá
// exibir o maior e o menor número digitado pelo usuário. 

import java.util.Scanner;

public class AlgoritmosLista3Exercicio13 {
    public static void main(String[] args) {
      int numero, menor = 0, maior = 0;
      Scanner ler = new Scanner(System.in);   
      for (int i = 0; i < 10; i++) {
        System.out.print("Digite um número: ");
        numero = ler.nextInt();
        if (i == 0) {
            maior = numero;
            menor = numero;
        }
        if (numero > maior) {
            maior = numero;
        }
        if (numero < menor) {
            menor = numero;
        }
      }
      System.out.println("Maior número digitado: " + maior);
      System.out.println("Menor número digitado: " + menor);
    }
}
