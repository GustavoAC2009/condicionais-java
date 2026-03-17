import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        double v = leitor.nextDouble();

        if (v > 500) { System.out.println(v * 0.80); }

        else if (v >= 200) { System.out.println(v * 0.90); }

        else { System.out.println(v); }
        

    }
}