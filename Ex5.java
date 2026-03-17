import java.util.Scanner;



public class Ex5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double n1 = leitor.nextDouble();
        double n2 = leitor.nextDouble();

        char op = leitor.next().charAt(0);

        switch (op) {
            case '+': System.out.println(n1 + n2); break;
            case '-': System.out.println(n1 - n2); break;
            case '*': System.out.println(n1 * n2); break;
            case '/': 

                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } 

                else {
                    System.out.println("Erro: Divisao por zero");
                }

                break;
      
      
            }

            leitor.close();

        }
}