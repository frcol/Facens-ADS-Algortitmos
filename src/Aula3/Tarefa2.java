package Aula3;

import java.util.Scanner;

public class Tarefa2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Entrada
        System.out.println("Digite um numero:");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero:");
        int num2 = scan.nextInt();
        
        // Processamento
        int soma = num1+num2;
        int subtracao = num1-num2;
        int multiplicacao = num1*num2;
        int divisao = num1/num2;
        
        // Saída
        System.out.println("====================="+
                           "\nNumero 1: "+num1 +
                           "\nNumero 2: "+num2 +
                           "\nSoma: "+soma +
                           "\nSubtracao: "+subtracao +
                           "\nMultiplicacao: "+multiplicacao +
                           "\nDivisao: "+divisao);
        
    }    
}
