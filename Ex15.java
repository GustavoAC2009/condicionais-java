import java.util.Scanner;
public class Ex15 {
        public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String usuarioFix = "admin";
        String senhaFix = "1234";
        String u = leitor.next();
        String s = leitor.next();
        String msg = (u.equals(uFix) && s.equals(sFix)) ? "Acesso permitido" : "Acesso negado";
        System.out.println(msg);
    }

}


