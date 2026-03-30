import java.util.Scanner;



   public class SistemaTeatroGAC {







    static String sNome = "Sala Beethoven";

    static String show = "O Fantasma da Ópera";

    static double preco = 100.0;

    static char[][] mapa = new char[12][12];

    static Scanner ler = new Scanner(System.in);







    public static void main(String[] args) {





        reset();



        int op;

        do {

            System.out.println("\n.:: TEATRO DEVISATE ::.");



            System.out.println("1. Mapa | 2. Reservar | 3. Comprar | 4. Cancelar");



            System.out.println("5. Financeiro | 7. Exercícios | 0. Sair");



            System.out.print("> ");



            op = ler.nextInt();

            switch (op) {



                case 1: verMapa(); break;



                case 2: acao('R'); break;



                case 3: acao('X'); break;



                case 4: cancelar(); break;



                case 5: relatorio(); break;



                case 7: menuEx(); break;



                case 0: System.out.println("Encerrando..."); break;



            }



        }

        

        while (op != 0);

    }







     private static void reset() {



        for (int i = 0; i < 12; i++) {



            for (int j = 0; j < 12; j++) mapa[i][j] = 'L';



        }

    }



    private static void verMapa() {





        System.out.println("\n" + sNome + " - " + show);



        System.out.print("     ");

        for (int i = 1; i <= 12; i++) System.out.printf("%-4d", i);

        System.out.println();



        for (int i = 0; i < 12; i++) {

            System.out.print((char) ('A' + i) + "  ");

            

            for (int j = 0; j < 12; j++) {

                String icon = (mapa[i][j] == 'L') ? "[ ]" : (mapa[i][j] == 'R' ? "[R]" : "[X]");

                System.out.print(icon + " ");



            }



            

            System.out.println();

        }



        System.out.println("\n[ ] Livre | [R] Reservada | [X] Ocupada");





    }





    

    private static void acao(char tipo) {





        System.out.print("Fila (A-L): ");

        int f = ler.next().toUpperCase().charAt(0) - 'A';

        System.out.print("Col (1-12): ");

        int c = ler.nextInt() - 1;

        

        if (f < 0 || f > 11 || c < 0 || c > 11) return;

        char atual = mapa[f][c];

        

        

        if (tipo == 'R' && atual == 'L') {

            mapa[f][c] = 'R';

            System.out.println("Reservado: R$" + (preco * 0.5));

        } 

        else if (tipo == 'X' && atual != 'X') {

            double v = (atual == 'R') ? (preco * 0.5) : preco;

            mapa[f][c] = 'X';

            System.out.println("Pago: R$" + v);

        }



}



     private static void cancelar() {

        System.out.print("Fila (A-L): ");

        int f = ler.next().toUpperCase().charAt(0) - 'A';

        System.out.print("Col (1-12): ");

        int c = ler.nextInt() - 1;

        if (f >= 0 && f < 12 && c >= 0 && c < 12 && mapa[f][c] == 'R') {

            mapa[f][c] = 'L';

            System.out.println("Cancelado. Reembolso: R$" + (preco * 0.5));

        }

    }





 private static void relatorio() {



        int l = 0, r = 0, x = 0;



        for

         (char[] f : mapa) {

            

            for (char m : f) {

                

                if (m == 'L') l++; else if (m == 'R') r++; else x++;

            }



        }

        double total = x * preco;

        double reserva = r * (preco * 0.5);

        System.out.println("\n--- FINANCEIRO ---");

        System.out.println("L: " + l + " | R: " + r + " | X: " + x);

        System.out.println("Arrecadado: R$" + total);

        System.out.println("Em Reservas: R$" + reserva);

        System.out.println("Potencial: R$" + (total + reserva + (l * preco)));

    }





    private static void menuEx() {

        int pg = 0, tot = 20, it = 7;

        int tPg = (int) Math.ceil((double) tot / it);

        while (true) {

            int in = pg * it, fi = Math.min(in + it, tot);



            System.out.println("\n--- EXERCÍCIOS (Pág " + (pg + 1) + "/" + tPg + ") ---");



            for (int i = in; i < fi; i++) System.out.println((i + 1) + ". Ex" + (i + 1));



            String a = (pg > 0) ? "[A] Ant " : "";



            String p = (pg < tPg - 1) ? "[P] Prox " : "";



            System.out.print("\n" + a + p + "[V] Voltar: ");



            String res = ler.next().toUpperCase();



            if (res.equals("V")) break;



            if (res.equals("P") && pg < tPg - 1) pg++;



            else if (res.equals("A") && pg > 0) pg--;



            else {

                try {

                    int n = Integer.parseInt(res);

                    if (n >= 1 && n <= 20) rodar(n);

               

                } catch (Exception e) {}

         

         

         

            }

    

    }



 }



    private static void rodar(int n) {



        String[] a = {};

        switch (n) {

            case 1: Ex1.main(a); break;



            case 2: Ex2.main(a); break;



            case 3: Ex3.main(a); break;



            case 4: Ex4.main(a); break;



            case 5: Ex5.main(a); break;



            case 6: Ex6.main(a); break;



            case 7: Ex7.main(a); break;



            case 8: Ex8.main(a); break;



            case 9: Ex9.main(a); break;



            case 10: Ex10.main(a); break;



            case 11: Ex11.main(a); break;



            case 12: Ex12.main(a); break;



            case 13: Ex13.main(a); break;



            case 14: Ex14.main(a); break;



            case 15: Ex15.main(a); break;



            case 16: Ex16.main(a); break;



            case 17: Ex17.main(a); break;



            case 18: Ex18.main(a); break;



            case 19: Ex19.main(a); break;



            case 20: Ex20.main(a); break;



        }



   

    }



}