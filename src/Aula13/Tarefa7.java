package Aula13;

import java.util.Scanner;

/*
Receber  10  n�meros  e  armazen�-los  em  um  vetor.  Ap�s  esta  primeira etapa 
� necess�rio pedir para o usu�rio digitar um n�mero. Verificar se este n�mero  
est�  armazenado  no  vetor  e  se  estiver  mostrar  quantas  vezes  o n�mero  
esta  armazenado  no  vetor,  ou  seja,  quantas  vezes  o  n�mero  se repete. 
Se o n�mero n�o estiver no vetor, uma mensagem deve indicar esta condi��o e dever� 
ser solicitado um novo n�mero para o usu�rio.
*/
public class Tarefa7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        // Receber os 10 n�meros e armazen�-los no vetor
        System.out.println("Digite 10 n�meros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        // Pedir ao usu�rio para digitar um n�mero
        System.out.print("Digite um n�mero: ");
        int numero = scanner.nextInt();
        
        boolean encontrado = false;
        int contador = 0;
        
        // Verificar se o n�mero est� no vetor e contar quantas vezes ele se repete
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                encontrado = true;
                contador++;
            }
        }
        
        // Verificar se o n�mero foi encontrado ou n�o
        if (encontrado) {
            System.out.println("O n�mero " + numero + " foi encontrado " + contador + " vez(es) no vetor.");
        } else {
            System.out.println("O n�mero " + numero + " n�o est� no vetor.");
        }
    }
}
