import java.util.Scanner;

public class Solucao08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = leitor.nextDouble();
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida inserida: " + nota);
        leitor.close();
    }
}
