import java.util.Scanner;

public class exercicioFilhos {
    public static void main(String[] args) {
        
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
