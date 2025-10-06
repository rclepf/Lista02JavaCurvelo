import java.util.Scanner;

public class Solucao12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Opção A");
            System.out.println("2 - Opção B");
            System.out.println("3 - Opção C");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1: System.out.println("Você escolheu a Opção A."); break;
                case 2: System.out.println("Você escolheu a Opção B."); break;
                case 3: System.out.println("Você escolheu a Opção C."); break;
                case 4: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida."); break;
            }
        }
        leitor.close();
    }
}
