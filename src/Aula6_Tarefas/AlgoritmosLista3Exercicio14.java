package Aula6_Tarefas;

// 14) Escreva um programa para imprimir a série de Fibonacci até a
// centésima posição: Exemplo: 0 1 1 2 3 5 8 13 21 ..... 

public class AlgoritmosLista3Exercicio14 {
    public static void main(String[] args) {
      int atual = 0, anterior = 1;
      for (int i = 0; i < 100; i++) {
        System.out.print(atual + " ");
        atual += anterior;
        anterior = atual - anterior;
      }
      System.out.println();
    }
}
