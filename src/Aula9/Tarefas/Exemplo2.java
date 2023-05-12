package Aula9.Tarefas;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Idade: ");
        int idade = scan.nextInt();
        
        int result = (idade > 18) ? idade : 0; 
                
        System.out.println(result);
          
    }
}
