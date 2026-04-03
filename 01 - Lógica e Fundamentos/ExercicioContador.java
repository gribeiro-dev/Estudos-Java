
import java.util.Scanner;

public class ExercicioContador {
    public static void main(String[] args) {

        /* Nesse exercicio, o meu objetivo era entender mais sobre os laços de repetição e arrays.
        Fiz isso usando o Scanner para receber valore inteiros, um vetor de inteiros e a variável i para o loop,
        e mostrei o resultado com System.out.println.
        */

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[11];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            int numero = leitor.nextInt();
            vetor[i] = numero;
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        leitor.close();

    }
}