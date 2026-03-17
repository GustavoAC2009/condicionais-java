import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double nota = leitor.nextDouble();
        if (nota >= 7) {

            System.out.println("Aprovado");
         } else if (nota >= 5) {

            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

}
