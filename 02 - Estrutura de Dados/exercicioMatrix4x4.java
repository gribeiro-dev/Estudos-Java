import java.util.Random;

public class exercicioMatrix4x4 {
    public static void main(String[] args) {
        /*
        Crie e exiba uma matriz 4x4 com números aleatórios entre 0 e 9. 
        Em seguida, identifique o maior valor presente na matriz e informe sua posição (linha e coluna) */

        int[][] array = new int[4][4];

        int maiorValor = 0;

        int linhaDoMaior = 0;

        int colunaDoMaior = 0;

        Random geradorRandom = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = geradorRandom.nextInt(9);
            }
        }

        maiorValor = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maiorValor < array[i][j]) {
                    maiorValor = array[i][j];

                    linhaDoMaior = i;

                    colunaDoMaior = j;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        
            System.out.println();

        }
        
        System.out.println("O maior valor da matriz é = " + maiorValor);
        System.out.println("Linha = " + linhaDoMaior);
        System.out.println("Coluna = " + colunaDoMaior);
    
    }
}