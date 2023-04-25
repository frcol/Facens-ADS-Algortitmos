package Aula8;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
               
        System.out.println("Primeiro nome:");
        String firstName = scan.nextLine();
        
        System.out.println("Segundo nome: ");
        String lastName = scan.next();
        
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
    }
}
