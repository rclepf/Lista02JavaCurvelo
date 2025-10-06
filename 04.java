import java.util.Scanner;

public class Solucao04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.print("Você é alfabetizado? (1 para Sim, 0 para Não): ");
        int alfabetizado = leitor.nextInt();

        if (idade >= 18 && alfabetizado == 1) {
            System.out.println("Você pode tirar a CNH.");
        } else {
            System.out.println("Você não atende aos requisitos para tirar a CNH.");
        }
        leitor.close();
    }
}
