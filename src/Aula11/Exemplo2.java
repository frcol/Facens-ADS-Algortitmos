package Aula11;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] nomes = new String[10];
        nomes[0] = "Fabio";
        nomes[1] = "Paulo";
        nomes[9] = "Darth Vader";
        
        System.out.println("Nome na casa 3 "+nomes[3]);
        System.out.println("Nome na casa 0 "+nomes[0]);
        System.out.println("Nome na casa 9 "+nomes[9]);
    }
}
