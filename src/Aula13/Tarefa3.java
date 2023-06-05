package Aula13;

import java.util.Scanner;

/*
Um  triângulo  pode  ser  classificado  de  acordo  com  as  medidas  de  seus lados: 
- Um triângulo equilátero possui todos os lados de mesma medida. 
- Um triângulo isósceles possui dois lados de mesma medida. 
- Um triângulo escaleno possui as medidas dos três lados diferentes
Receber  os  três  lados  de  um  triângulo  em  qualquer  ordem  (chame  de 
lado1, lado2 e lado3) e classificá-lo em equilátero, isósceles ou escaleno. 

*/
public class Tarefa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] lados = new double[3];
        
        // Obter as medidas dos três lados do triângulo
        for (int i=0; i < lados.length; i++) {
            System.out.print("Digite o valor do lado "+(i+1)+": ");
            lados[i] = scanner.nextDouble();
        }
        
        // Classificar o triângulo
        if (lados[0] == lados[1] && lados[0] == lados[2]) {
            System.out.println("O triângulo é equilátero.");
        } else if (lados[0] == lados[1] || lados[0] == lados[2] 
                || lados[1] == lados[2]) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }
    }
}
