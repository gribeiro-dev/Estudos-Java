

import java.util.Scanner;

public class ExercicioMedias {
    public static void main(String[] args) {

        /* Nesse exercicio, o meu objetivo era fazer um calculo simples de 4 notas escolares e determinar a media das notas, além disso, 
        se o aluno reprovar na primeira média escolar, ele refaz uma prova de recuperação e essa (nota+médiaAnterior) resulta em aprovação ou Reprovado
        Fiz isso usando as variáveis float e boolean para armazenar os valores e utilizei condicionais para fazer as condições para aprovação ou reprovação do aluno
        Por fim, mostrei o resultado com printf.
        */

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

