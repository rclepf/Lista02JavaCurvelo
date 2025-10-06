import java.util.Scanner;

public class Solucao30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = {{5, 12, 3}, {1, 8, 9}, {10, 7, 4}};
        boolean encontrado = false;

        System.out.print("Digite um número para buscar na matriz: ");
        int numeroBusca = leitor.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroBusca) {
                    System.out.println("Número " + numeroBusca + " encontrado na linha " + i + ", coluna " + j + ".");
                    encontrado = true;
                    break;
                }
            }
            if(encontrado) break;
        }

        if (!encontrado) {
            System.out.println("O número " + numeroBusca + " não foi encontrado na matriz.");
        }
        leitor.close();
    }
}
