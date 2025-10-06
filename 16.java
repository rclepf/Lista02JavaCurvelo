public class Solucao16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("O primeiro múltiplo de 7 encontrado foi: " + i);
                break; // Para o laço
            }
        }
    }
}
