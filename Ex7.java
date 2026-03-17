import java.util.Scanner;



public class Ex7 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o A: ");
        int a = leitor.nextInt();

        System.out.println("Digite o B: ");
        int b = leitor.nextInt();

        System.out.println("Digite o C: ");
        int c = leitor.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Equilatero");
            } 

            else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } 
            
            else {
                System.out.println("Escaleno");
            }
        }


        leitor.close();
    }
}