import java.util.Scanner;

public class Solucao18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = leitor.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= numero; ++i) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        leitor.close();
    }
}
