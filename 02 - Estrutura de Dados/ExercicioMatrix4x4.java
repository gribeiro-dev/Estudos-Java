import java.util.Random;

public class ExercicioMatrix4x4 {
    public static void main(String[] args) {
        /*
        Nesse exercicio, o meu objetivo eera criar e exibir uma matriz 4x4 com números aleatórios entre 0 e 9. 
        Em seguida, eu tenho que identificar o maior valor presente na matriz e falar sua posição (linha e coluna) 
        
        Para fazer isso tudo, eu criei um array 2D de [4] linhas e [4] colunas, depois de criar, preenchi todos os valores
        utilizando o laço for para percorrer todos valores e gerar um valor aleatório para ele.
        Com todos os valores cheios de algum valor aleatório, eu utilizei outros laços que percorrem a lista novamente e criei uma variável 
        'maiorValor' que guarda o valor atual e o substitui e guarda a sua linha[i] e coluna[j] sempre que encontra um número maior 
        durante as iterações 
        
        Por fim, eu mostro o resultado da matriz, maior valor, linha e coluna com println*/

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

                    linhaDoMaior = i+1;

                    colunaDoMaior = j+1;
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