package Aula6_Tarefas;

// 12) Escreva um programa que leia 10 números e ao final ele deverá exibir
// quantos positivos, negativos e zeros foram digitados. 

import java.util.Scanner;

public class AlgoritmosLista3Exercicio12 {
    public static void main(String[] args) {
      int numero, positivos = 0, negativos = 0, zeros = 0;
      Scanner ler = new Scanner(System.in);   
      for (int i = 1; i <= 10; i++) {
        System.out.print("Digite um numero: ");
        numero = ler.nextInt();
        if (numero > 0) {
            positivos++;
        } else if (numero < 0) {
            negativos++;
        } else {
            zeros++;
        }
      }
      System.out.println("Foram digitados:");
      System.out.println(positivos + " número(s) positivo(s);");
      System.out.println(negativos + " número(s) negativo(s);");
      System.out.println(zeros + " número(s) zero(s).");
    }
}
