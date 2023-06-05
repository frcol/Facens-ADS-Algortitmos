package Aula13;

import java.util.Scanner;

/*
Escreva um programa para receber o saldo inicial de uma conta banc�ria de um cliente.
A seguir ler um n�mero indeterminado de pares de valores indicando  respectivamente 
o  tipo  da  opera��o,  sendo:  1.Dep�sito 2.Retirada 3.Fim e tamb�m o valor. 
Quando for informado para o tipo o c�digo  3,  o  programa  deve  ser  encerrado  
e  impresso  o  saldo  final  da conta  com  as  seguintes  mensagens:  
CONTA  ZERADA,  CONTA ESTOURADA (se o saldo for negativo) ou CONTA PREFERENCIAL 
(se o saldo for positivo). 
*/
public class Tarefa6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o saldo inicial da conta banc�ria: ");
        double saldo = scanner.nextDouble();
        
        int tipoOperacao;
        double valor;
        
        do {
            System.out.print("Digite o tipo da opera��o (1 - Dep�sito, 2 - Retirada, 3 - Fim): ");
            tipoOperacao = scanner.nextInt();
            
            if (tipoOperacao == 1) {
                System.out.print("Digite o valor do dep�sito: ");
                valor = scanner.nextDouble();
                saldo += valor;
            } else if (tipoOperacao == 2) {
                System.out.print("Digite o valor da retirada: ");
                valor = scanner.nextDouble();
                saldo -= valor;                    
            }
        } while (tipoOperacao != 3);
        
        System.out.println("Saldo final da conta: " + saldo);
        
        if (saldo == 0) {
            System.out.println("CONTA ZERADA");
        } else if (saldo < 0) {
            System.out.println("CONTA ESTOURADA");
        } else {
            System.out.println("CONTA PREFERENCIAL");
        }
    }
}
