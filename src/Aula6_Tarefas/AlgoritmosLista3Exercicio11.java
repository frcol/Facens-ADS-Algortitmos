package Aula6_Tarefas;

// 11) Escreva um programa que solicite ao usuário que insira um número
// inteiro positivo. Em seguida, deve imprimir a tabuada de multiplicação
// completa desse mesmo número. 

import java.util.Scanner;

public class AlgoritmosLista3Exercicio11 {
    public static void main(String[] args) {
      int numero;
      Scanner ler = new Scanner(System.in);   
      System.out.print("Digite um numero: ");
      numero = ler.nextInt();
      System.out.println("Tabuada do " + numero + ":");
      for (int i = 0; i <= 10; i++){
        System.out.println(numero + " x " + i + " = " + (numero * i));
      }
    }
}
