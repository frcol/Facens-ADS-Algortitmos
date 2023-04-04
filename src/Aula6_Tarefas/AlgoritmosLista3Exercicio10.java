package Aula6_Tarefas;

// 10) Faça um algoritmo que leia 20 números e, ao final, escreva 
// quantos estão entre 0 e 100

import java.util.Scanner;

public class AlgoritmosLista3Exercicio10 {
    public static void main(String[] args) {
      int numero, count = 0;
      Scanner ler = new Scanner(System.in);   
            
      for(int i = 0; i < 20; i++){
        System.out.print("Digite um numero: ");
        numero = ler.nextInt();
        
        if(numero >= 0 && numero <= 100){
            count++;
        }        
      }
      System.out.println("Total: " + count);
    }
}
