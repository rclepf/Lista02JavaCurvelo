import java.util.Scanner;

public class Solucao10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senhaCorreta = "java123";
        String palpite;

        do {
            System.out.print("Tente adivinhar a senha: ");
            palpite = leitor.nextLine();
        } while (!palpite.equals(senhaCorreta));

        System.out.println("Senha correta! Acesso liberado.");
        leitor.close();
    }
}
