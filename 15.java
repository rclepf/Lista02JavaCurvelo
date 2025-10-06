public class Solucao15 {
    public static void main(String[] args) {
        System.out.println("Números ímpares de 1 a 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) { // Se for par
                continue; // Pula para a próxima iteração
            }
            System.out.println(i);
        }
    }
}
