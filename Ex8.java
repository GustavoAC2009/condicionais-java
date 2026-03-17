import java.util.Scanner;




public class Ex8 {
    public static void main(String[] args) {
 
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu Peso: ");
        double peso = leitor.nextDouble();

        System.out.println("Digite a sua Altura: ");
        double altura = leitor.nextDouble();


         double imc = peso / (altura * altura);

        if (imc < 18.5) { System.out.println("Abaixo do peso"); }

        else if (imc < 25) { System.out.println("Peso normal"); }

        else if (imc < 30) { System.out.println("Sobrepeso"); }

        else { System.out.println("Obesidade"); }

     
        System.out.println((imc >= 18.5 && imc < 25) ? "Dentro" : "Fora");

leitor.close();
 
    }

}
