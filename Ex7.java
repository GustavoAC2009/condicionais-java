import java.util.Scanner;



public class Ex7 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();
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
    }
}