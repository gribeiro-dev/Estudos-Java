
import java.util.Scanner;

public class exercicioFederal {
    public static void main(String[] args) {
        /* Crie um programa que permita armazenar o nome, peso, altura e da data de
        nascimento de até 50 pessoas. Cada pessoa deve ser representada por uma estrutura
        dentro de um array. A data de nascimento também deve ser uma estrutura. O seu
        programa deve ser capaz de ler todos os dados das 50 pessoas e mostra-las. */

        Scanner leitor = new Scanner(System.in);

        int[] notaDosAlunos = new int[11];

        double soma = 0;

        for (int i = 0; i <= notaDosAlunos.length - 1; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            notaDosAlunos[i] = leitor.nextInt();
            soma += notaDosAlunos[i];
        }
        
        double media = soma / notaDosAlunos.length;

        System.out.println("Relatório das notas dos alunos: ");
        System.out.println("A média dos alunos foi de: " + (media));
        System.out.println("Alunos acima da média: ");

        for (int i = 0; i < media; i++) {
            if (notaDosAlunos[i] >= 7) {
                System.out.println("Aluno " + i + " = " + notaDosAlunos[i]);
            }
        }
    }
}

