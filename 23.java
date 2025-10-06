public class Solucao23 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int countPares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                countPares++;
            }
        }
        System.out.println("Existem " + countPares + " números pares no array.");
    }
}
