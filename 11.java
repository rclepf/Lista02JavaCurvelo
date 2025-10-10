import java.util.Scanner;

public class Solucao11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = leitor.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = leitor.nextInt();
        long resultado = 1;
        int i = 0;

        while (i < expoente) {
            resultado *= base;
            i++;
        }

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
        leitor.close();
    }
}
