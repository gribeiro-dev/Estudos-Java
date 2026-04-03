public class ExercicioTridimensional {
    public static void main(String[] args) {

        /* Nesse exercicio, o meu objetivo era treinar arrays tridimensionas, logo, fiz um exercio onde cria uma matriz tridimensional onde 
        cada elemento da matriz é igual à soma dos seus índices (exemplo: M[1,2,1] = 1+2+1 = 4).
        
        Como eu estruturei a lógica:
        - Criei uma matriz tridimensional int[3][3][3] e variáveis contadoras para pares e ímpares;
        - Usei laços 'for' para percorrer cada posição [i][j][k] da matriz e defini que os valores serão iguais a i + j + k a cada iteração do laço;

        - Dentro do laço de percorrer, utilizei o operador de resto para dizer (se o resto da divisão por 2 é zero) 
        então ele é par, caso contrario, ele é impar. Dessa forma, eu consigo atualizar os contadores de par e impar
        
        - Por fim, utilizei outro laço para exibir a matriz formatada no terminal e mostrei quantos pares e impares 
        existem na matriz, com o valor da variavel [numerosPar] e [numerosImpares]
        */
        
        int[][][] matrizTridimensional = new int[3][3][3];

        int soma = 0;

        int somaPares = 0;

        int somaImpares = 0;

        for (int i = 0; i < matrizTridimensional.length; i++) {
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {

                    matrizTridimensional[i][j][k] = i + j + k;

                    soma += matrizTridimensional[i][j][k];

                    if (matrizTridimensional[i][j][k] % 2 == 0) {

                        somaImpares += matrizTridimensional[i][j][k];

                    } else {
                        somaPares += matrizTridimensional[i][j][k];
                    }
                }
            }
        }
        
        System.out.println("A soma dos pares é = " + somaPares);
        System.out.println("A soma dos impares é: " + somaImpares);
        System.out.println("A soma total é = " + soma);

    }
}
