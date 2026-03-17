import java.util.Scanner;






public class Ex19 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double vel = leitor.nextDouble();
        double lim = leitor.nextDouble();


        if (vel <= lim) { System.out.println("sem multa"); }
        

        else if (vel <= lim * 1.20) { System.out.println("Multa leve"); }
        else if (vel <= lim * 1.50) { System.out.println("Multa grave"); }
        else { System.out.println("Multa gravissima + suspensao"); }



    }

}