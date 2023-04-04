package Aula6_Tarefas;

// 6)Leia a idade de 20 pessoas e exiba a soma das idades. 
import java.util.Scanner;

public class AlgoritmosLista3Exercicio6 {
    public static void main(String[] args) {
      int soma = 0, idade;
      Scanner ler = new Scanner(System.in);   
      for(int i = 0; i < 20; i++){
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();        
        soma = soma + idade;
      } 
      System.out.println("Soma: " + soma);
    }
}
