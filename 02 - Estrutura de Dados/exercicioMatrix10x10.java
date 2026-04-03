import java.util.Random;

public class exercicioMatrix10x10 {
    public static void main(String[] args) throws InterruptedException {

        Random geradorRandom = new Random();

        int[][] array10x10 = new int[10][10];

        int menorValorLinha5 = 0;

        int maiorValorLinha5 = 0;

        int menorValorColuna7 = 0;

        int maiorValorColuna7 = 0;

        // Um laço de repetição que preenche o nosso array com valores random
        for (int i = 0; i < array10x10.length; i++) {
            for (int j = 0; j < array10x10[i].length; j++) {
                array10x10[i][j] = geradorRandom.nextInt(10);
            }
        }

        // Denomino o maiorValor para o primeiro da lista
        maiorValorLinha5 = array10x10[4][0];

        // Laço de repetição que compara os valores no array com o primeiro ja atribuido, caso for maior, o valor antigo é apagado e o maior se torna o novo
        for (int j = 1; j < array10x10[4].length; j++) {
            if (array10x10[4][j] > maiorValorLinha5) {
                maiorValorLinha5 = array10x10[4][j];
            }
        }

        // Denomino o menorValor para a primeira coluna da linha 4 do array
        menorValorLinha5 = array10x10[4][0];

        // Laço de repetição que percorre a nossa linha 5 e ve todas as colunas e compara
        for (int j = 1; j < array10x10[4].length; j++) {
            if (array10x10[4][j] < menorValorLinha5) {
                menorValorLinha5 = array10x10[4][j];
            }
        }

        maiorValorColuna7 = array10x10[0][6];
        
        // Laço de repetição que compara os valores no array com o primeiro ja atribuido, caso for maior, o valor antigo é apagado e o maior se torna o novo
        for (int i = 1; i < array10x10.length; i++) {
            if (array10x10[i][6] > maiorValorColuna7) {
                maiorValorColuna7 = array10x10[i][6];
           }
        }

        menorValorColuna7 = array10x10[0][6];

        for (int i = 1; i < array10x10.length; i++) {
            if (array10x10[i][6] < menorValorColuna7) {
                menorValorColuna7 = array10x10[i][6];
            }
        }


        for (int i = 0; i < array10x10.length; i++) {
            for (int j = 0; j < array10x10[i].length; j++) {
                System.out.print(array10x10[i][j] + " ");
                Thread.sleep(70);
            }

            System.out.println();

        }

        System.out.println();

        System.out.println(">---- Relatório da matriz ----<");

        Thread.sleep(300);

        System.out.println("Maior valor da linha 5 = " + maiorValorLinha5);

        Thread.sleep(250);

        System.out.println("Menor valor da linha 5 = " + menorValorLinha5);

        Thread.sleep(190);

        System.out.println("Maior valor da coluna 7 = " + maiorValorColuna7);

        Thread.sleep(140);

        System.out.println("Menor valor da coluna 7 = " + menorValorColuna7);

        System.out.println(">------------------------------<");

    }
}