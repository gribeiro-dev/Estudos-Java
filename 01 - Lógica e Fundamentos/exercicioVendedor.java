
import java.util.Scanner;

public class exercicioVendedor {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int soma = 0;

        double[][] notaQualquer = new double[2][4];

        double[][] notaDosAlunos = {
            { 10.0, 7.0, 6.0, 8.0},
            { 10.0, 9.0, 8.5, 9.0}
        };

        for (int i = 0; i < notaDosAlunos.length; i++) {

            soma = 0;

            for (int j = 0; j < notaDosAlunos[i].length; j++) {
                System.out.print(notaDosAlunos[i][j] + " ");

                soma += notaDosAlunos[i][j];

            }

            System.out.println();
            System.out.print("A média das notas é = " + soma / 4);
            System.out.println();
        }
    }
}


