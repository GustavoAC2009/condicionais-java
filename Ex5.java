import java.util.Scanner;



public class Ex5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o primeiro número? ");
        double n1 = leitor.nextDouble();

        System.out.println("Qual o segundo número? ");
        double n2 = leitor.nextDouble();

        System.out.println("Informe um operador: 1- ADIÇÃO 2- SUBTRAÇÃO 3- MULTIPLICAÇÃO 4- DIVISÃO");
        int op = leitor.nextInt();

        double ad = n1 + n2;
        double sub = n1 - n2;
        double mult = n1 * n2;
        double vid = n1 / n2;

    

        switch (op) {
            case 1:
                 System.out.println("O resultado é: "+ad); break;

            case 2:
                 System.out.println("O resultado é: "+sub); break; 

            case 3:
                 System.out.println("O resultado é: "+mult); break;

            default:
                 System.out.println("O resultado é: "+vid); 


                if (n2 != 0) {
                    System.out.println(vid);
                } 

                else {
                    System.out.println("Erro: Divisao por zero");
                }

                break;

                
      
      
            }  
            
            

            leitor.close();

        }
}