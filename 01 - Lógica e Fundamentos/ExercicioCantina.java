package exercicioDiferente;

import java.util.Scanner;

public class ExercicioCantina {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double cachorroQuente = 4.00;
        double xSalada = 4.50;
        double xBacon = 5.00;
        double torrada = 2.0;
        double refrigerante = 1.50;
        double valor1;
        double valor2;

        int opcao1 = leitor.nextInt(), quantidade = leitor.nextInt();

        switch (opcao1) {
            case 1:
                valor1 = 4.00;
                break;
            case 2:
                valor1 = 4.50;
                break;
            case 3:
                valor1 = 5.00;
                break;
            case 4:
                valor1 = 2.0;
                break;
            default:
                valor1 = 1.50;
                break;

        }

        System.out.printf("Total: R$ %.2f%n", ( valor1 * quantidade));




    }
}
