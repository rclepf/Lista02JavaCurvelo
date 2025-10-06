import java.util.Scanner;

public class Solucao01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String usuarioCorreto = "admin";
        String senhaCorreta = "senha123";

        System.out.print("Digite o nome de usuário: ");
        String usuarioDigitado = leitor.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDigitada = leitor.nextLine();

        if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
        leitor.close();
    }
}
