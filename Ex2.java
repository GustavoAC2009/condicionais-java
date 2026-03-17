import java.util.Scanner;



public class Ex2 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();

        int maior = (n1 > n2) ? n1 : n2;

        System.out.println(maior);



        leitor.close();
    }
    
}