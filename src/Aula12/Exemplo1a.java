package Aula12;

public class Exemplo1a {
    public static void main(String[] args) {
        int minhaMatriz[][] = new int[3][3];
        
        minhaMatriz[0][0] = 100;
        minhaMatriz[1][1] = 200;
        minhaMatriz[2][2] = 300;
        
        int matriz2[][] = {{1,2,3}, 
                           {4,5,6}, 
                           {7,8,9}};
        
        matriz2[1][1] = 0;
    }
}
