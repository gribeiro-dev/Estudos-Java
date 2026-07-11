package estrutura_dados;

import java.util.Random;

public class ExercicioSomaMedia {
    public static void main(String[] args) throws InterruptedException {

        Random geradorRandom = new Random();

        int[] listaDeNumeros = new int[5];

        int soma = 0;


        for (int i = 0; i < listaDeNumeros.length; i++) {

            listaDeNumeros[i] = geradorRandom.nextInt(10);

        }

        for (int i = 0; i < listaDeNumeros.length; i++) {

            soma += listaDeNumeros[i];

            System.out.print(listaDeNumeros[i] + " | ");

        }

        System.out.println();

        System.out.print("--------------------");

        System.out.println();

        System.out.println("Soma = " + soma);

        System.out.println("Media = " + (float) soma / listaDeNumeros.length);


    }
}
