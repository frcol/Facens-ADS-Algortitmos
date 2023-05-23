package Aula12;

import java.util.Scanner;

/*
Receber  números  do  usuário  para  preencher  um  vetor  de  10  posições, 
porém, só é permitido armazenar no vetor números positivos (repetir até que 
as  10  posições  do  vetor  estejam  preenchidas).  No  final,  exiba  a  soma  de 
todos os números que estão nas posições ímpares do vetor.
*/

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int counter = 0;
        int num = 0;
        int total = 0;
        
        do {
            System.out.println("Digite um número ["+ (counter+1) +"]");
            num =  scan.nextInt();
            
            if (num > 0) {
                numeros[counter] = num;
                counter++;
            }
            else {
                System.out.println("## Digite um número positivo");
            }
        } while (counter < 10);
        
        System.out.println("===========================");
        for (int i = 1; i <= numeros.length; i += 2) {
            System.out.println(i+": "+numeros[i]);
            total += numeros[i];
        }
        
        System.out.println("Total: "+total);
    }
}
