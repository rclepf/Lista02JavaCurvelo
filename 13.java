import java.util.Scanner;

public class Solucao13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        leitor.close();
    }
}
