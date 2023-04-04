package Aula6_Tarefas;

// 9)Escreva um algoritmo que leia 20 números do usuário e 
// exiba quantos números são pares.

import java.util.Scanner;

public class AlgoritmosLista3Exercicio9 {
    public static void main(String[] args) {
      int numero, pares = 0;
      Scanner ler = new Scanner(System.in);   
      for(int i = 0; i < 20; i++){
        System.out.print("Digite um numero: ");
        numero = ler.nextInt();
        if(numero % 2 == 0){
            System.out.println("O numero " + numero + "é par");
            pares++;
        }        
      }
      System.out.println("Quant pares: " + pares);
    }
}
