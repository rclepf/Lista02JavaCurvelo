import java.util.Scanner;

public class Solucao02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Classificação: Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Classificação: Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Classificação: Adulto");
        } else {
            System.out.println("Classificação: Idoso");
        }
        leitor.close();
    }
}
