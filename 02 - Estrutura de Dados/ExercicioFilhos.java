import java.util.Scanner;

public class ExercicioFilhos {
    public static void main(String[] args) {

        /* Nesse exercicio, o meu objetivo era treinar arrays irregulares, com isso em mente, eu criei um sistema que pergunta ao usuario 
        quantos filhos ele possui, e pergunta o nome de cada um deles, por fim, ele cria uma posição em um array para cada filho com o seu nome
        
        Para isso, eu defini o número de linhas (entrevistados) com base na entrada do usuário;
        Após saber quantas pessoas serão no total, eu criei um laço que pergunta quantos filhos a pessoa tem e só então crio um 
        array de tamanho[entrevistados][qtdFilhos]
        
        Depois, utilizei laços para perguntar o nome de cada filhos e armazenar a resposta em uma posição no array
        
        Por fim, eu usei um for para percorrer a matriz e mostrei um relatório que diz o nome dos filhos da (primeira, segunda...) pessoa entrevistada
        
        */
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o numero de entrevistados: ");
        int numeroEntrevistados = leitor.nextInt();

        String[][] arrayFilhos = new String[numeroEntrevistados][];

        for (int i = 0; i < arrayFilhos.length; i++) {

            System.out.print((i+1) + " pessoa entrevistada, " + " entre com a quantidade de filhos: ");
            int qtdFilhos = leitor.nextInt();

            arrayFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < arrayFilhos[i].length; j++) {
                System.out.println("Qual o nome do filho " + (j+1));
                String nomeFilho = leitor.next();

                arrayFilhos[i][j] = nomeFilho;

            }
        }

        for (int i = 0; i < arrayFilhos.length; i++) {
            System.out.println("-> A pessoa " + (i + 1) + " tem " + arrayFilhos.length + " filhos. ");

            for (int j = 0; j < arrayFilhos[i].length; j++) {
                System.out.println("-> " + (j + 1) + " nome: " + arrayFilhos[i][j]);
            }
        }
    
        leitor.close();

    }

}
