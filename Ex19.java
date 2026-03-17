import java.util.Scanner;






public class Ex19 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double vel = leitor.nextDouble();
        double lim = leitor.nextDouble();


        if (vel <= lim) { System.out.println("Sem Multa"); }


        else if (vel <= lim * 1.20) { System.out.println("Multa Leve"); }
        else if (vel <= lim * 1.50) { System.out.println("Multa Grave"); }
        else { System.out.println("Multa Gravíssima + Suspensão"); }



    }

}