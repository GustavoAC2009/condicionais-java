             import java.util.Scanner;


public class Ex20 {  

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String j1 = leitor.next();
        String j2 = leitor.next();
        String res;

        if (j1.equals(j2)) { res = "Empate"; }

        else if ((j1.equals("pedra") && j2.equals("tesoura")) ||
                 (j1.equals("papel") && j2.equals("pedra")) ||
                 (j1.equals("tesoura") && j2.equals("papel"))) {
            res = "Jogador 1 venceu";
        } 
        
        else {
            res = "Jogador 2 venceu";
        }

        
        System.out.println(res);


    }
} 