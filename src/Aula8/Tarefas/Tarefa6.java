package Aula8.Tarefas;

import java.util.Scanner;
/*
Faça um programa que leia uma string e conte a quantidade de vogais e consoantes 
usando for e switch case. Por exemplo, se o usuário informar a string "hello world", 
o programa deve exibir:
*/
public class Tarefa6 {
    public static void main(String[] args) {
        // variaveis
        Scanner scan = new Scanner(System.in);
        int numVogais = 0;
        int numConsoantes = 0;
        
        // entrada
        System.out.println("Digite uma palavra");
        String str = scan.nextLine();
        
        for (int i=0; i < str.length(); i++) {
            char letra = str.charAt(i);
            
            switch (letra) {
                case 'a':
                case 'e':   
                case 'i':
                case 'o':
                case 'u':
                    numVogais++;
                    break;
                default:
                    numConsoantes++;
            }
        }
        
        System.out.println("Vogais: "+numVogais);
        System.out.println("Consoantes: "+numConsoantes);
    }
}
