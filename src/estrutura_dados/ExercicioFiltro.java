package estrutura_dados;

import java.util.Random;

public class ExercicioFiltro {
    public static void main(String[] args) {

        int[] listaDeNumInteiros = new int[10];

        int quantidadeDePares = 0;


        for (int i = 0; i < listaDeNumInteiros.length; i++) {

            listaDeNumInteiros[i] = new Random().nextInt(100);

        }

        // Depois de preencher o array, vamos percorrer para mostrar e ja pensar nos pares

        for (int j = 0; j < listaDeNumInteiros.length; j++) {

            System.out.print(listaDeNumInteiros[j] + " | ");

        }

        System.out.println();

        System.out.println("------------------------------------------------");

        System.out.print("-> Lista dos pares: ");

        for (int i = 0; i < listaDeNumInteiros.length; i++) {

            if (listaDeNumInteiros[i] % 2 == 0) {

                quantidadeDePares++;

                System.out.print(listaDeNumInteiros[i] + " | ");

            }
        }

        System.out.println();

        System.out.println("-> Quantidade de pares: " + quantidadeDePares);

    }
}
