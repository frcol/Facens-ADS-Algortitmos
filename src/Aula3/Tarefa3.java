package Aula3;

import java.util.Scanner; 

public class Tarefa3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // entrada de dados
        System.out.println("Nome: ");
        String nome = scan.nextLine();
        System.out.println("Endereco: ");
        String endereco = scan.nextLine();
        System.out.println("Telefone: ");
        String telefone = scan.nextLine();
        System.out.println("Area de atuacao: ");
        String area = scan.nextLine();
        
        // Processamento
        
        // saida de dados
        System.out.println("Nome: "+nome
                            + "\nEndereco: "+endereco
                            + "\nTelefone: "+telefone
                            + "\nArea de atuacao: "+area);
    }
}
