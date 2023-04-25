package Aula8.Tarefas;

import java.util.Scanner;
/*
Um programa precisa exibir uma mensagem de acordo com o tipo de erro que ocorreu
em um sistema. A tabela abaixo mostra os códigos e as mensagens correspondentes:
*/
public class Tarefa4 {
    public static void main(String[] args) {
        // variaveis
        Scanner scan = new Scanner(System.in);
        String message = "";   
        
        // entrada
        System.out.println("Digite o código do erro: ");
        int codErro = scan.nextInt();
        
        
        switch (codErro) {
            case 1:
                message = "Erro de conexão com o servidor";
                break;
            case 2:
                message = "Usuário ou senha inválido";
                break;
            case 3:
                message = "Arquivo não encontrado";
                break;
            case 4:
                message = "Espaço em disco insuficiente";
                break;
            case 5:
                message = "Permissão negada para acessar arquivo ou pasta";
                break;
                
            default:
                message = "## ERRO NÃO IDENTIFICADO ##";
        }
        
        System.out.println(message);
    }
}
