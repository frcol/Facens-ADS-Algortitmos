package Aula6_Tarefas;

// 15) Escreva um programa que leia um número do usuário, após a leitura o
// programa deverá realizar a soma abaixo indicada até que o número digitado 
// pelo usuário seja alcançado começando a partir de 1. 
// Exemplo: 1 + 1/2 + 1/3 + 1/4 + 1/5 +............1/n 
// (n será o número digitado pelo usuário).  

import java.util.Scanner;

public class AlgoritmosLista3Exercicio15 {
    public static void main(String[] args) {
      int numero;
      double resultado = 0.0;
      Scanner ler = new Scanner(System.in);   
      
      System.out.print("Digite um numero: ");
      numero = ler.nextInt();
      System.out.print("resultado = ");
      
      for (int i = 1; i <= numero; i++) {
          resultado += (1.0 / i);
          if (i > 1) {
              System.out.print(" + ");
          }
          System.out.print("1/" + i);
      }
      System.out.println();
      System.out.println("resultado: " + resultado);
    }
}
