public class Solucao29 {
    public static void main(String[] args) {
        double[][] notasAlunos = {
            {8.5, 7.0, 9.5},  // Aluno 1
            {9.0, 8.0, 7.5},  // Aluno 2
            {6.5, 5.0, 7.0},  // Aluno 3
            {10.0, 9.5, 9.0}  // Aluno 4
        };

        for (int i = 0; i < notasAlunos.length; i++) {
            double soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            double media = soma / notasAlunos[i].length;
            System.out.println("A média do Aluno " + (i + 1) + " é: " + media);
        }
    }
}
