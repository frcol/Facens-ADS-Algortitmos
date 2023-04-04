package Aula6_Tarefas;

// 5)Escreva um algoritmo que leia 10 números do 
// usuário e calcule a soma desses números. 

import java.util.Scanner;

public class AlgoritmosLista3Exercicio5 {
    public static void main(String[] args) {
      int soma = 0, numero;
      Scanner ler = new Scanner(System.in);   
      for(int i = 0; i < 10;i++){
        System.out.print("Digite um numero: ");
        numero = ler.nextInt();        
        soma = soma + numero;
      } 
      System.out.println("Soma: " + soma);
    }
}
