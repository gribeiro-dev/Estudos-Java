
import java.util.Scanner;

public class ExercicioMatrix3x3 {
    public static void main(String[] args) {

        /* Nesse exercicio, o meu objetivo foi criar uma matriz 3x3 onde o próprio usuário insere os valores para cada posição. 
        * Além de armazenar os dados, durante esse processo, ele consegue determeinar se esse numero é par ou impar a cada vez que o
        loop é rodado.
        Como eu estruturei a lógica:
        - Criei uma matriz bidimensional 'int[3][3]' e variáveis contadoras para pares e ímpares;
        - Usei laços 'for' aninhados para percorrer cada posição [i][j] da matriz;
        - Dentro do laço de leitura, utilizei o operador de resto para dizer (se o resto da divisão por 2 é zero) 
        então ele é par, caso contrario, ele é impar. Dessa forma, eu consigo atualizar os contadores de par e impar
        - Por fim, utilizei outro laço para exibir a matriz formatada no terminal e mostrei quantos pares e impares 
        existem na matriz, com o valor da variavel [numerosPar] e [numerosImpares]
        */
        
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
