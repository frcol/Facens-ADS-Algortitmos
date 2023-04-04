package Aula6_Tarefas;

// 3) Leia o nome do usuário e
// escreva o nome dele na tela 10 vezes. 

import java.util.Scanner;

public class AlgoritmosLista3Exercicio3 {
    public static void main(String[] args) {
        String nome;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = ler.next();
        for (int i = 0; i < 10; i++){            
            System.out.println(i + ": " + nome);
        }   
    }   
}  
