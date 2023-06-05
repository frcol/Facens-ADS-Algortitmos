package Aula13;

import java.util.Scanner;

/*
Receber  10  números  e  armazená-los  em  um  vetor.  Após  esta  primeira etapa 
é necessário pedir para o usuário digitar um número. Verificar se este número  
está  armazenado  no  vetor  e  se  estiver  mostrar  quantas  vezes  o número  
esta  armazenado  no  vetor,  ou  seja,  quantas  vezes  o  número  se repete. 
Se o número não estiver no vetor, uma mensagem deve indicar esta condição e deverá 
ser solicitado um novo número para o usuário.
*/
public class Tarefa7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        // Receber os 10 números e armazená-los no vetor
        System.out.println("Digite 10 números:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        // Pedir ao usuário para digitar um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        boolean encontrado = false;
        int contador = 0;
        
        // Verificar se o número está no vetor e contar quantas vezes ele se repete
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                encontrado = true;
                contador++;
            }
        }
        
        // Verificar se o número foi encontrado ou não
        if (encontrado) {
            System.out.println("O número " + numero + " foi encontrado " + contador + " vez(es) no vetor.");
        } else {
            System.out.println("O número " + numero + " não está no vetor.");
        }
    }
}
