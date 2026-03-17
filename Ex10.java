import java.util.Scanner;


   public class Ex10 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite algum Número: ");


        double num = leitor.nextDouble();
        String res = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Zero";
        System.out.println(res);

 leitor.close();
    }
    
}