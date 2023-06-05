package Aula13;

import java.util.Scanner;

/*
Desenvolver  um  programa  que  recebe  a  altura  e  o  sexo  (1  para masculino,
2  para  feminino)  de  5  pessoas.  Este  programa  deverá mostrar no final: 
- a menor altura do grupo; 
- a média de altura das mulheres;  
- o número de homens;  
- o sexo da pessoa mais alta. 

*/
public class Tarefa5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePessoas = 1;
        
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaMulheres = 0;
        int numeroMulheres = 0;
        int numeroHomens = 0;
        double alturaMaisAlta = 0;
        int sexoMaisAlto = 0;
        
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            double altura = scanner.nextDouble();
            
            System.out.print("Digite o sexo da pessoa (1 - masculino, 2 - feminino): ");
            int sexo = scanner.nextInt();
            
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            
            if (sexo == 2) {
                somaAlturaMulheres += altura;
                numeroMulheres++;
            }
            
            if (sexo == 1) {
                numeroHomens++;
            }
            
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                sexoMaisAlto = sexo;
            }
        }
        
        double mediaAlturaMulheres = somaAlturaMulheres / numeroMulheres;
        
        System.out.println("Menor altura do grupo: " + menorAltura);
        System.out.printf("Média de altura das mulheres: %.2f\n", mediaAlturaMulheres);
        System.out.println("Número de homens: " + numeroHomens);
        
        String sexoMaisAltoTexto = (sexoMaisAlto == 1) ? "Masculino" : "Feminino";
        System.out.println("Sexo da pessoa mais alta: " + sexoMaisAltoTexto);
     
    }
}
