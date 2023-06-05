package Aula13;

import java.util.Scanner;

/*
Voc� assina um plano de 50 minutos no celular que custa R$ 50.00 por m�s,  
independente  de  utiliz�-los  integralmente  ou  n�o.  Por�m,  se  voc� utilizar 
mais do que 50 minutos, � cobrado mais R$ 1.50 por cada minuto que passar dos 50 
do seu plano. Receber quantos minutos foram gastos no m�s e calcular o valor da 
conta
*/
public class Tarefa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Obter a quantidade de minutos gastos no m�s
        System.out.print("Digite a quantidade de minutos gastos no m�s: ");
        int minutosGastos = scanner.nextInt();
        
        // Verificar se ultrapassou os 50 minutos do plano
        int minutosPlano = 50;
        double valorPlano = 50.00;
        double valorAdicional = 1.50;
        double valorConta;
        
        if (minutosGastos <= minutosPlano) {
            // N�o ultrapassou os 50 minutos do plano
            valorConta = valorPlano;
        } else {
            // Ultrapassou os 50 minutos do plano, calcular valor com minutos adicionais
            int minutosExcedentes = minutosGastos - minutosPlano;
            valorConta = valorPlano + (minutosExcedentes * valorAdicional);
        }
        
        // Exibir o valor da conta
        System.out.println("O valor da conta �: R$ " + valorConta);
    }
}
