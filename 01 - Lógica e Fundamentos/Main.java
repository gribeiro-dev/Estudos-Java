
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadeDePositivos = 0;
        double somaDosPositivos = 0;

        float n1 = leitor.nextFloat();

        if (n1 > 0) {
            quantidadeDePositivos = quantidadeDePositivos + 1;
            somaDosPositivos = somaDosPositivos + n1;
        }
        float n2 = leitor.nextFloat();

        if (n2 > 0) {
            quantidadeDePositivos = quantidadeDePositivos + 1;
            somaDosPositivos = somaDosPositivos + n2;
        }
        float n3 = leitor.nextFloat();

        if (n3 > 0) {
            quantidadeDePositivos = quantidadeDePositivos + 1;
            somaDosPositivos = somaDosPositivos + n3;
        }

        float n4 = leitor.nextFloat();

        if (n4 > 0) {
            quantidadeDePositivos = quantidadeDePositivos + 1;
            somaDosPositivos = somaDosPositivos + n4;
        }

        float n5 = leitor.nextFloat();

        if (n5 > 0) {
            quantidadeDePositivos = quantidadeDePositivos + 1;
            somaDosPositivos = somaDosPositivos + n5;
        }

        float n6 = leitor.nextFloat();

        if (n6 > 0) {
            quantidadeDePositivos = quantidadeDePositivos + 1;
            somaDosPositivos = somaDosPositivos + n6;
        }

        System.out.println(quantidadeDePositivos + " valores positivos");
        System.out.printf("%.1f%n", somaDosPositivos / 4);
    }
}
