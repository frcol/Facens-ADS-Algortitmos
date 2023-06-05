package Aula13;

import java.util.Scanner;

/*
Escreva um programa para receber o saldo inicial de uma conta bancária de um cliente.
A seguir ler um número indeterminado de pares de valores indicando  respectivamente 
o  tipo  da  operação,  sendo:  1.Depósito 2.Retirada 3.Fim e também o valor. 
Quando for informado para o tipo o código  3,  o  programa  deve  ser  encerrado  
e  impresso  o  saldo  final  da conta  com  as  seguintes  mensagens:  
CONTA  ZERADA,  CONTA ESTOURADA (se o saldo for negativo) ou CONTA PREFERENCIAL 
(se o saldo for positivo). 
*/
public class Tarefa6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o saldo inicial da conta bancária: ");
        double saldo = scanner.nextDouble();
        
        int tipoOperacao;
        double valor;
        
        do {
            System.out.print("Digite o tipo da operação (1 - Depósito, 2 - Retirada, 3 - Fim): ");
            tipoOperacao = scanner.nextInt();
            
            if (tipoOperacao == 1) {
                System.out.print("Digite o valor do depósito: ");
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
