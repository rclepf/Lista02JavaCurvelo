import java.util.Scanner;

public class Solucao09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite números para somar (positivos). Digite 0 para parar.");
        do {
            System.out.print("Número: ");
            numero = leitor.nextInt();
            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.println("A soma dos números positivos é: " + soma);
        leitor.close();
    }
}
