import java.util.Scanner;

public class Solucao07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número para a contagem regressiva: ");
        int numero = leitor.nextInt();

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
        leitor.close();
    }
}
