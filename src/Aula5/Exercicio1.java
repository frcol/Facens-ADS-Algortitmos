package Aula5;

public class Exercicio1 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int temp;
        
        System.out.println(a + "," + b);
        
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + "," + b);
    }
}
