import java.util.Scanner;

public class Solucao05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = leitor.next().charAt(0);
        double resultado = 0;

        switch (operacao) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': resultado = num1 / num2; break;
            default: System.out.println("Operação inválida!"); return;
        }
        System.out.println("O resultado é: " + resultado);
        leitor.close();
    }
}
