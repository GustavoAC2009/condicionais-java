import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o ano desejado: ");
        int ano = leitor.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Bissexto");
        }
        
        else {
            System.out.println("Nao bissexto");
        }


        leitor.close();

    }

}
