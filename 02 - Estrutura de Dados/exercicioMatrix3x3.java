
import java.util.Scanner;

public class exercicioMatrix3x3 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int numerosPares = 0;

        int numerosImpares = 0;
        
        int[][] array3x3 = new int[3][3];

        for (int i = 0; i < array3x3.length; i++) {
            for (int j = 0; j < array3x3[i].length; j++) {
                System.out.print("Coloque o valor desejado para a posição " + "[" + i + "," + j + "] " + ": ");
                array3x3[i][j] = leitor.nextInt();

                if (array3x3[i][j] % 2 == 0) {
                    numerosPares += 1;
                } else {
                    numerosImpares += 1;
                }

            }
        }

        System.out.println();

        for (int i = 0; i < array3x3.length; i++) {
            for (int j = 0; j < array3x3[i].length; j++) {
                System.out.print(array3x3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Pares = " + numerosPares);
        System.out.println("Impares = " + numerosImpares);

        leitor.close();
    
    }
}
