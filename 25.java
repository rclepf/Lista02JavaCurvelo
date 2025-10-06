public class Solucao25 {
    // A resolução deste exercício é praticamente a mesma que a do 23.
    // O for-each é mais para leitura e não para busca direta com índice,
    // mas a lógica de busca é a mesma.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] nomes = {"Ana", "Carlos", "Beatriz", "Daniel"};
        boolean encontrado = false;

        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = leitor.nextLine();

        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBusca)) {
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
