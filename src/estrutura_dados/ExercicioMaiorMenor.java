package estrutura_dados;

import java.util.Random;

public class ExercicioMaiorMenor {
    public static void main(String[] args) throws InterruptedException {

        int[] arrayDeInteiros = new int[20];

        Random GeradorNum = new Random();

        int maiorNumero = 0;

        int menorNumero = 0;

        for (int i = 0; i < arrayDeInteiros.length; i++) {
            arrayDeInteiros[i] = GeradorNum.nextInt(10);

            if (arrayDeInteiros[i] > maiorNumero) {
                maiorNumero = arrayDeInteiros[i];
            }

            if (arrayDeInteiros[i] < menorNumero) {
                menorNumero = arrayDeInteiros[i];
            }

            Thread.sleep(200);

            System.out.print(arrayDeInteiros[i]);

            Thread.sleep(100);

            System.out.print(" | ");


        }

        System.out.println("\n-------------------------------------------------------------------------------");

        System.out.println("Maior numero: " + maiorNumero);

        System.out.print("Menor numero: " + menorNumero);

        System.out.println("\n-------------------------------------------------------------------------------");

    }
}
