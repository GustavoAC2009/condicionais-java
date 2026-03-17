import java.util.Scanner;





public class Ex14 {
    public static void main(String[] args) {

    
    Scanner leitor = new Scanner(System.in);
         
        System.out.println("Digite os números de sua escolha: ");
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        int n3 = leitor.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("Empate");
        } 
        else if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1);
        } 
     else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2);
        }
         else {
            System.out.println(n3);
        }

        leitor.close();
    }
}