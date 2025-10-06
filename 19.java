import java.util.Scanner;

public class Solucao19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = leitor.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("A média das notas é: " + media);
        leitor.close();
    }
}
