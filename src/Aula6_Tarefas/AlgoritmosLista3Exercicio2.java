package Aula6_Tarefas;

// 2)Escreva um algoritmo que 
// calcule a soma dos números de 1 a 15. 

public class AlgoritmosLista3Exercicio2 {
    public static void main(String[] args) {
        int soma = 0;
        
        for (int i = 1; i <= 15; i++){            
            System.out.print("Soma: " + i + " + " + 
                                                soma + " = ");
            soma = soma + i;
            System.out.print(soma);
            System.out.println(" ");
        }   
    }   
}  
