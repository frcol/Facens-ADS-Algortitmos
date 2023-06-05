package Aula13;

import java.util.Scanner;

/*
Uma empresa paga R$ 10.00 por hora normal trabalhada e R$ 15.00 por hora  extra.  
Receber  o  total  de  horas  normais  e  o  total  de  horas  extras trabalhadas 
por um empregado no mês. Calcular e exibir o salário dele
*/
public class Tarefa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Obter o total de horas normais trabalhadas
        System.out.print("Digite o total de horas normais trabalhadas: ");
        int horasNormais = scanner.nextInt();
        
        // Obter o total de horas extras trabalhadas
        System.out.print("Digite o total de horas extras trabalhadas: ");
        int horasExtras = scanner.nextInt();
        
        // Calcular o salário
        double salario = (horasNormais * 10.00) + (horasExtras * 15.00);
        
        // Exibir o salário
        System.out.println("O salário do empregado é: R$ " + salario);
    }
}
