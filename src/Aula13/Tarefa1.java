package Aula13;

import java.util.Scanner;

/*
Uma empresa paga R$ 10.00 por hora normal trabalhada e R$ 15.00 por hora  extra.  
Receber  o  total  de  horas  normais  e  o  total  de  horas  extras trabalhadas 
por um empregado no m�s. Calcular e exibir o sal�rio dele
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
        
        // Calcular o sal�rio
        double salario = (horasNormais * 10.00) + (horasExtras * 15.00);
        
        // Exibir o sal�rio
        System.out.println("O sal�rio do empregado �: R$ " + salario);
    }
}
