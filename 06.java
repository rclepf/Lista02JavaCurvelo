import java.util.Scanner;

public class Solucao06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o código do setor (100, 200 ou 300): ");
        int codigo = leitor.nextInt();

        switch (codigo) {
            case 100: System.out.println("Setor: Administrativo"); break;
            case 200: System.out.println("Setor: Financeiro"); break;
            case 300: System.out.println("Setor: RH"); break;
            default: System.out.println("Setor inválido."); break;
        }
        leitor.close();
    }
}
