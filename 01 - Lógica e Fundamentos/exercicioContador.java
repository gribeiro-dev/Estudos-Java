
import java.util.Scanner;

public class exercicioContador {
    public static void main(String[] args) {

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

    }
}