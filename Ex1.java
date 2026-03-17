import java.util.Scanner;



 public class Ex1 {
    public static void main(String[] args) {

         Scanner leitor = new Scanner(System.in);

         int numero = leitor.nextInt();
 
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
 
        System.out.println(resultado);

  
    }

}

