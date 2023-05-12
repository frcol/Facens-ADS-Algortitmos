package Aula11;

public class Exemplo3 {
    public static void main(String[] args) {
        
        String[] meses = {"Janeiro", "Fevereiro", "Marco", 
                        "Abril", "Maio", "Junho", "Julho", 
                        "Agosto", "Setembro", "Outubro", 
                        "Novembro", "Dezembro"};
        
        String[] meses2 = new String[12];
        meses2[0] = "Janeiro";
        
        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i]);
        }
        
        
        
    }
}
