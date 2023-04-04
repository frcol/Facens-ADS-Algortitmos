package Aula6_Tarefas;

// 4)Leia o nome e um número N do usuário. 
// Escreva o nome dele na tela N vezes.  

import java.util.Scanner;

public class AlgoritmosLista3Exercicio4 {
    public static void main(String[] args) {
        String nome;
        int numero;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = ler.next();
        System.out.print("Digite um número: ");
        numero = ler.nextInt();
        for (int i = 1; i <= numero; i++){            
            System.out.println(i + ": " + nome);
        }   
    }   
}  
