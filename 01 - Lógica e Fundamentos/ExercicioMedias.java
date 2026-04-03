

import java.util.Scanner;

public class ExercicioMedias {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float n1 = leitor.nextFloat(), n2 = leitor.nextFloat(), n3 = leitor.nextFloat(), n4 = leitor.nextFloat();

        float media = ( (n1 * 2) + (n2 * 3) + (n3 * 4) + (n4) ) / 10;

        boolean isMediaDeRecuperacao = (media >= 5.0 && media < 6.9);

        if (media >= 7.0 ) {

            System.out.println("Media: " + media);
            System.out.println("Aluno aprovado.");

        } else if (isMediaDeRecuperacao) {

            float notaExame = leitor.nextFloat();

            float mediaFinal = (notaExame + media) / 2;

            boolean isMediaFinalAprovada = (mediaFinal > 5);

            if (isMediaFinalAprovada) {

                System.out.println("Media: " + media);
                System.out.println("Aluno em exame.");
                System.out.println("Nota do exame: " + notaExame);
                System.out.println("Aluno aprovado.");
                System.out.println("Media final " + mediaFinal);

            } else {

                System.out.printf("Media: %.1f%n", media);
                System.out.println("Aluno em exame.");
                System.out.printf("Nota do exame: " + notaExame);
                System.out.println("Aluno reprovado.");
                System.out.println("Media final " + mediaFinal);
            }
        } else {

            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        }
    }
}

