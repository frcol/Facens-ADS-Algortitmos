package Aula3;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scan; // declarei var do tipo Scanner
        scan = new Scanner(System.in); // atribui um objeto para a var
        
        System.out.println("Digite a sua idade");
        int idade = scan.nextInt();
        
        System.out.println("Obrigado! \n Sua idade e "+idade);
    } 
}
