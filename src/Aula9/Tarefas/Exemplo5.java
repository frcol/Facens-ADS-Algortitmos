package Aula9.Tarefas;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opt = 0;
        
        while(opt != 4) {
            System.out.println();
            System.out.println("[1] Cadastrar\n[2] Editar\n[3] Pesquisar\n[4]Sair");
            opt = scan.nextInt();
            
            switch (opt) {
                case 1:
                    System.out.println("CADASTRAR");
                    break;
                case 2:
                    System.out.println("EDITAR");
                    break;
                case 3:
                    System.out.println("PESQUISAR");
                    break;
                case 4:
                    System.out.println("SAIU");
                    break;
                default:
                    System.out.println("## Opcao invalida ##");
                    break;
            }
        }
        
        System.out.println("Segue...");
    }
}
