package Aula13;

import java.util.Scanner;

/*
Um  tri�ngulo  pode  ser  classificado  de  acordo  com  as  medidas  de  seus lados: 
- Um tri�ngulo equil�tero possui todos os lados de mesma medida. 
- Um tri�ngulo is�sceles possui dois lados de mesma medida. 
- Um tri�ngulo escaleno possui as medidas dos tr�s lados diferentes
Receber  os  tr�s  lados  de  um  tri�ngulo  em  qualquer  ordem  (chame  de 
lado1, lado2 e lado3) e classific�-lo em equil�tero, is�sceles ou escaleno. 

*/
public class Tarefa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] lados = new double[3];
        
        // Obter as medidas dos tr�s lados do tri�ngulo
        for (int i=0; i < lados.length; i++) {
            System.out.print("Digite o valor do lado "+(i+1)+": ");
            lados[i] = scanner.nextDouble();
        }
        
        // Classificar o tri�ngulo
        if (lados[0] == lados[1] && lados[0] == lados[2]) {
            System.out.println("O tri�ngulo � equil�tero.");
        } else if (lados[0] == lados[1] || lados[0] == lados[2] 
                || lados[1] == lados[2]) {
            System.out.println("O tri�ngulo � is�sceles.");
        } else {
            System.out.println("O tri�ngulo � escaleno.");
        }
    }
}
