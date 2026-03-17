import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        if (n % 3 == 0 && n % 5 == 0) { System.out.println("Multiplo de 3 e 5"); }

        else if (n % 3 == 0) { System.out.println("Multiplo apenas de 3"); }

        else if (n % 5 == 0) { System.out.println("Multiplo apenas de 5"); }

        else { System.out.println("Nao e multiplo"); }

    
    
    }
}