import java.util.Scanner;




public class Ex4 {

    public static void main(String[] args) {

         Scanner leitor = new Scanner(System.in);
 
        double temp = leitor.nextDouble();

        String res = (temp < 15) ? "Frio" : (temp <= 25) ? "Agradável" : "Quente";
        System.out.println(res);

    }

}
