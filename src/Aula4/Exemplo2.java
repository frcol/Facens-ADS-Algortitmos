package Aula4;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Voce esta de folga?");
        boolean temFolga = scan.nextBoolean();
        System.out.println("Hoje tem Sol?");
        boolean temSol = scan.nextBoolean();

        if (temSol && temFolga) {
            System.out.println("Tem e voce esta de folga!");
        } else if (temSol && !temFolga) {
            System.out.println("Tem sol mas voce precisa trabalhar.");
        } else if (!temSol && temFolga) {
            System.out.println("Voce esta de folga mas nao tem sol.");
        } else {
            System.out.println("Voce precisa trabalhar e nao tem sol.");
        }
    }
}
