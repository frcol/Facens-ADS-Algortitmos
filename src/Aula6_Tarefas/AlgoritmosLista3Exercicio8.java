package Aula6_Tarefas;

// 8) Leia a idade de 20 pessoas e 
// exiba quantas pessoas são maiores de idade. 

import java.util.Scanner;

public class AlgoritmosLista3Exercicio8 {
    public static void main(String[] args) {
      int idade, maiores = 0;
      Scanner ler = new Scanner(System.in);   
      for(int i = 0; i < 20; i++){
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();
        if(idade >= 18){
           maiores++; 
        }        
      }
      System.out.println("Maiores de idade: " + maiores);
    }
}
