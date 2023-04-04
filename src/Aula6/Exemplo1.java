package Aula6;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Menor valor:");
        int menorValor = scan.nextInt();
        System.out.println("Maior valor:");
        int maiorValor = scan.nextInt();
        
        for (int i = menorValor; i <= maiorValor; i++) {
            System.out.println("i = "+i);
        }
    }
}
