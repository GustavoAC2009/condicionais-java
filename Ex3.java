import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota = leitor.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

        double med = (nota + nota2 + nota3) / 3;

        String result = (med >= 7.0) ? "Aprovado" : (med >= 5.0) ? "Recuperação" : "Reprovado";

        System.out.println("A nota média é: " +med+ " então foi " +result+ ".");












leitor.close();


        }





        
    }


