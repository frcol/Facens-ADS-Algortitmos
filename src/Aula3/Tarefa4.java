package Aula3;

import java.util.Scanner;

public class Tarefa4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Entrada
        System.out.println("Quantos cavalos foram comprados?");
        int numCavalos = scan.nextInt();
        
        // Processamento
        int numFerraduras = numCavalos * 4;
        
        // saida
        System.out.println("O numero necessario de ferraduras sera: "+numFerraduras);
    }
}
