import java.util.Scanner;


public class Ex12 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a sua nota: ");
        double nota = leitor.nextDouble(); 
        

        if (nota >= 9) { System.out.println("A"); }

        else if (nota >= 7) { System.out.println("B"); }

        else if (nota >= 5) { System.out.println("C"); }

        else { System.out.println("D"); }
leitor.close();

 
    }
}

 