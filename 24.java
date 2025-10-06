import java.util.Scanner;

public class Solucao24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] nomes = {"Ana", "Carlos", "Beatriz", "Daniel"};
        boolean encontrado = false;

        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = leitor.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome '" + nomeBusca + "' foi encontrado.");
        } else {
            System.out.println("O nome '" + nomeBusca + "' não foi encontrado.");
        }
        leitor.close();
    }
}
