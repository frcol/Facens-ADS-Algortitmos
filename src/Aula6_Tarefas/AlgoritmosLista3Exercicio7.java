package Aula6_Tarefas;

// 7)Leia a idade de 20 pessoas e exiba a média das idades. 

import java.util.Scanner;

public class AlgoritmosLista3Exercicio7 {
    public static void main(String[] args) {
      int soma = 0, idade, quant = 20;
      float media;
      Scanner ler = new Scanner(System.in);   
      for(int i = 0; i < quant; i++){
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();        
        soma = soma + idade;
      }
      media = soma / quant;
      System.out.printf("Media: %.2f", media);
    }
}
