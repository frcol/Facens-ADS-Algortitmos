package Aula12;

public class Exemplo1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int numero = 0;
        
        // Preenchendo a matriz com números inteiros crescentes
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero;
                numero++;
            }
        }
        
        // Imprimindo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

