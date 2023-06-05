package Aula13;

import java.util.Scanner;

/*
Você assina um plano de 50 minutos no celular que custa R$ 50.00 por mês,  
independente  de  utilizá-los  integralmente  ou  não.  Porém,  se  você utilizar 
mais do que 50 minutos, é cobrado mais R$ 1.50 por cada minuto que passar dos 50 
do seu plano. Receber quantos minutos foram gastos no mês e calcular o valor da 
conta
*/
public class Tarefa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Obter a quantidade de minutos gastos no mês
        System.out.print("Digite a quantidade de minutos gastos no mês: ");
        int minutosGastos = scanner.nextInt();
        
        // Verificar se ultrapassou os 50 minutos do plano
        int minutosPlano = 50;
        double valorPlano = 50.00;
        double valorAdicional = 1.50;
        double valorConta;
        
        if (minutosGastos <= minutosPlano) {
            // Não ultrapassou os 50 minutos do plano
            valorConta = valorPlano;
        } else {
            // Ultrapassou os 50 minutos do plano, calcular valor com minutos adicionais
            int minutosExcedentes = minutosGastos - minutosPlano;
            valorConta = valorPlano + (minutosExcedentes * valorAdicional);
        }
        
        // Exibir o valor da conta
        System.out.println("O valor da conta é: R$ " + valorConta);
    }
}
