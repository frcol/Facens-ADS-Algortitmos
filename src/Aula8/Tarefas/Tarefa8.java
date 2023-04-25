package Aula8.Tarefas;

import java.util.Scanner;
/*
Imprima um triangulo de Números com 5 linhas
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15
*/
public class Tarefa8 {
    public static void main(String[] args) {
        int tamanho = 5;
        int valor = 1;
        //String space = "";
        
        for (int i=0; i < tamanho; i++) {
            for (int j=0; j <= i;j++) {
                //space = String.valueOf(valor).length() > 1?"  ":"   ";
                System.out.print(valor+ " ");//+space
                valor++;
            }
            System.out.println("");
        }
    }
}
