import java.util.Scanner;





public class Ex11 {

    public static void main(String[] args) {

          Scanner leitor = new Scanner(System.in);

          System.out.println("Digite a sua Idade: ");
         int idade = leitor.nextInt();

        if (idade < 12 || idade > 60) {
            System.out.println("R$ 10,00");
        } 
        else {
            System.out.println("R$ 20,00");
        }



        leitor.close();
    }

}
