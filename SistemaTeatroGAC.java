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




