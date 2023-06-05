package Aula13;

import java.util.Scanner;

/*
Leia  um  vetor A de  6  elementos  contendo o  gabarito  da  Mega-Sena. 
O sorteio consiste na extração de 6 números diferentes, no universo de 01 a 60.    
A  seguir,  ler  um  vetor  B  de  10  elementos  contendo  uma  aposta. 
Escrever quantos pontos fez o apostador, e se ele fez a sena (6 acertos), 
a quina (5 acertos) ou a quadra (4 acertos). 
*/
public class Tarefa9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] gabarito = new int[6];
        int[] aposta = new int[10];
        
        // Ler o gabarito da Mega-Sena
        System.out.println("Digite os 6 números do gabarito da Mega-Sena:");
        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = scanner.nextInt();
        }
        
        // Ler a aposta do jogador
        System.out.println("Digite os 10 números da sua aposta:");
        for (int i = 0; i < aposta.length; i++) {
            aposta[i] = scanner.nextInt();
        }
        
        // Verificar os acertos da aposta
        int pontos = 0;
        for (int i = 0; i < aposta.length; i++) {
            for (int j = 0; j < gabarito.length; j++) {
                if (aposta[i] == gabarito[j]) {
                    pontos++;
                }
            }
        }
        
        // Verificar o resultado da aposta
        switch (pontos) {
            case 6:
                System.out.println("Parabéns! Você acertou a sena!");
                break;
            case 5:
                System.out.println("Parabéns! Você acertou a quina!");
                break;
            case 4:
                System.out.println("Parabéns! Você acertou a quadra!");
                break;
            default:
                System.out.println("Infelizmente você não acertou nenhum prêmio.");
                break;
        }
    }
}
