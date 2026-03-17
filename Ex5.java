import java.util.Scanner;



public class Ex5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o primeiro número? ");
        double n1 = leitor.nextDouble();

        System.out.println("Qual o segundo número? ");
        double n2 = leitor.nextDouble();


        double ad = n1 + n2;
        double sub = n1 - n2;
        double mult = n1 * n2;
        double vid = n1 / n2;

    

        switch (op) {
            case 1: System.out.println("O resultado é: "); break;
            case 2: System.out.println(); break;
            case 3: System.out.println(); break;
            case 4: System.out.println(); break;

                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } 

                else {
                    System.out.println("Erro: Divisao por zero");
                }

                break;

                
      
      
            }  
            
            System.out.println("O resultado é: " +);

            leitor.close();

        }
}