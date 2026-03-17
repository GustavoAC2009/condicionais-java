import java.util.Scanner;
public class Ex15 {

    
        public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String usuarioFix = "admin";
        String senhaFix = "1234";
         
        System.out.println("Usuário: ");
        String u = leitor.next();

        System.out.println("Senha: ");
         String s = leitor.next();

        String msg = (u.equals(usuarioFix) && s.equals(senhaFix)) ? "Acesso permitido" : "Acesso negado";
        System.out.println(msg);

        leitor.close();

    }

}


