package Aula8;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a inicial de uma fruta: ");
        String frutaIni = scan.nextLine();
        
        switch (frutaIni) {
            case "a":
            case "A":
                System.out.println("Abacaxi");
                break;
            case "b":
                System.out.println("Banana");
                break;
            case "p":
                System.out.println("pera");
                break;
            default:
                System.out.println("Fruta não cadastrada!");       
        }
    }
}
