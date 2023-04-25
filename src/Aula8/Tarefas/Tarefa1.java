package Aula8.Tarefas;

import java.util.Scanner;
/*
Peça para o usuário a quantidade de números que será digitado.
Mostre a soma dos números pares e de números ímpares.
*/
public class Tarefa1 {
    public static void main(String[] args) {
        // variaveis
        Scanner scan = new Scanner(System.in);
        int totalPar = 0;
        int totalImpar = 0;
        
        // entrada
        System.out.println("Informe a quantidade de numeros:");
        int qtde = scan.nextInt();
        
        // processamento
        for (int i=1; i <= qtde; i++) {
            System.out.printf("Informe o numero %d: \n",i);
            int num = scan.nextInt();
            
            if (num % 2 == 0) {
                totalPar += num;
                //totalPar = totalPar + num;
            }
            else {
                totalImpar += num;
            }
        }
        
        // saida
        System.out.println("\nTotal de pares: "+totalPar);
        System.out.println("Total de impares: "+totalImpar);
    }
}
