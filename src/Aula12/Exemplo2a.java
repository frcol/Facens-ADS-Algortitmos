package Aula12;

import java.util.Scanner;

public class Exemplo2a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(linha+" x "+coluna+": ");
                matriz[linha][coluna] = scan.nextInt();
            }
        }
        
        System.out.println("\n============================");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println(linha+" x "+coluna+": "+matriz[linha][coluna]);
            }
        }
    }
}
